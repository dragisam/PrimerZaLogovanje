package com.dragisa.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.dragisa"})
@EnableTransactionManagement

@PropertySource("classpath:database.properties")
public class ServiceAndDataSourceConfiguration {

@Value("${database.driver}") String datDriv;
@Value("${database.url}") String datUrl;
@Value("${database.user}") String datUser;
@Value("${database.password}") String datPass;
@Value("${database.dialect}") String datDial;

@Bean
public static PropertyPlaceholderConfigurer properties(){
PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
Resource[] resources = new ClassPathResource[ ] 
		{ new ClassPathResource( "database.properties" ) };
ppc.setLocations(resources);
ppc.setIgnoreUnresolvablePlaceholders( true );
return ppc;
} @Bean
public DataSource dataSource() { 
	DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
	dataSource.setDriverClassName(datDriv); 
	dataSource.setUrl(datUrl); 
	dataSource.setUsername(datUser); 
	dataSource.setPassword(datPass); 
	return dataSource;
} private Properties getHibernateProperties() {
	Properties properties = new Properties(); 
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.dialect", datDial);
	return properties;
}
@Bean
  public LocalSessionFactoryBean sessionFactory() {
	LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
	sessionFactoryBean.setDataSource(dataSource());
	sessionFactoryBean.setPackagesToScan("com.dragisa.model"); 
	sessionFactoryBean.setHibernateProperties(getHibernateProperties());
	return sessionFactoryBean; }

@Bean 
public HibernateTransactionManager transactionManager() { 
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(); 
	transactionManager.setSessionFactory(sessionFactory().getObject()); 
	return transactionManager; }

}