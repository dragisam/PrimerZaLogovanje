package com.dragisa.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Ranga Reddy
 * @version 1.0
 */
@Repository
public class HibernateUtil {
	
	@Autowired
    private SessionFactory sessionFactory;
		
   
    
    @SuppressWarnings("unchecked")	
    public <T> List<T> fetchAll(Class<T> entityClass) {        
        return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();        
    }
  
   
    
    /*@SuppressWarnings("unchecked")
	public <T> T fetchByImail(String imail, Class<T> entityClass) {
        return (T)sessionFactory.getCurrentSession().get(entityClass, imail);
    }
    */
    
	
}
