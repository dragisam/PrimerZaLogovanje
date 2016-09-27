package com.dragisa.dao.impl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dragisa.dao.StudentDao;
import com.dragisa.model.Student;
import com.dragisa.util.HibernateUtil;


@Repository("studentDao")

public class StudentDaoImpl implements StudentDao {
	/*@Autowired
    private HibernateUtil hibernateUtil;*/
 
 public StudentDaoImpl() {
		
	}
 /*@Override
 public List<Student> getAllStudenti() {        
     return hibernateUtil.fetchAll(Student.class);
 }*/

@Autowired	
 private SessionFactory sf;
@Override
@Transactional
public void saveOrUpdate(Student student) {
    sf.getCurrentSession().saveOrUpdate(student);
}

@Override
@Transactional
public List<Student> list() {
    @SuppressWarnings("unchecked")
    List<Student> listStudent = (List<Student>) sf.getCurrentSession()
            .createCriteria(Student.class)
            .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

    return listStudent;
}

@Override
@Transactional
public Student get(String name) {
    String hql = "from Student where name='"+name+"'";
    Query query = sf.getCurrentSession().createQuery(hql);
     
    @SuppressWarnings("unchecked")
    List<Student> listStudent = (List<Student>) query.list();
     
    if (listStudent != null && !listStudent.isEmpty()) {
        return listStudent.get(0);
    }
     
    return null;
}
@Override
@Transactional
public boolean checkUserInDatabase(Student student){
	String hql="select name from Student where email='"+student.getEmail()+"' and password='"+
student.getPassword()+"'";
	//String hql="select email from Student";
	Query upit= sf.getCurrentSession().createQuery(hql);
		/*Session session = sf.getCurrentSession();
	Transaction tx = session.beginTransaction();
	Query upit=session.createQuery(hql);
	
	List<Student> studenti = new ArrayList<Student>();*/
	
	
	List<String> s_email=upit.list();
	//List<Object[]> s_email=query.list();
	//String ime=s_email.get(0);
	
	
	if (s_email.isEmpty()){
		System.out.println("netacno");
		return false;}
		else{
			//System.out.println(ime);
			return true;
		}
	//return (! s_email.isEmpty());
	
	/*List<Student> studenti = new ArrayList<Student>();
	for(Object[] student:studenti)*/
	
	
}
}
