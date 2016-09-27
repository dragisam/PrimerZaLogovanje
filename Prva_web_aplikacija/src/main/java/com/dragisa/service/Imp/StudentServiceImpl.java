package com.dragisa.service.Imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.dragisa.dao.StudentDao;
import com.dragisa.model.Student;
import com.dragisa.sevice.StudentService;

@Service("studentService")
@Transactional()
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	public StudentServiceImpl() {
		
	}
	@Override
	@Transactional
	public boolean checkUserInDatabase(Student student){
		
		return studentDao.checkUserInDatabase(student);
		
	}
	 /*@Override
	    public List<Student> getAllStudenti() {
	        return studentDao.getAllStudenti();
	    }*/
	@Override
	@Transactional
	public void saveOrUpdate(Student student){
		studentDao.saveOrUpdate(student);
		
	};
	public List<Student> list(){
		return studentDao.list();
	};
	public Student get(String name){
		return studentDao.get(name);
	};
}
