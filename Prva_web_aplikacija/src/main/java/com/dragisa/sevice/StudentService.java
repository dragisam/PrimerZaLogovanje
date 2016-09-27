package com.dragisa.sevice;



import java.util.List;

import org.springframework.stereotype.Service;

import com.dragisa.model.Student;

//@Service
public interface StudentService {
	
	
	public boolean checkUserInDatabase(Student student) ;
	public void saveOrUpdate(Student student);
	public List<Student> list();
	public Student get(String email);
	/* public List<Student> getAllStudenti();	*/
	
}
