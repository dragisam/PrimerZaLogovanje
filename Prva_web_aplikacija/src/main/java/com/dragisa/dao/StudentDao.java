package com.dragisa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dragisa.model.Student;

public interface StudentDao {
	public boolean checkUserInDatabase(Student student);

	/* public List<Student> getAllStudenti(); */
	public void saveOrUpdate(Student student);

	public List<Student> list();
	public Student get(String name);
}
