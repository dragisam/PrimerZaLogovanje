package com.dragisa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.init.ScriptStatementFailedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dragisa.model.Student;
import com.dragisa.model.User;
import com.dragisa.sevice.StudentService;
import com.dragisa.sevice.UserService;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * Servlet implementation class LoginServlet
 */
@Controller

//@RequestMapping("/loginController")
//@SessionAttributes("student")
public class LoginController  {
	
	
	@Autowired
    StudentService studentService;
	
	//User user;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	/*public LogincController() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public ModelAndView doPost(@ModelAttribute ("student") Student student) {
				
		   return procedRequest(student);
	  }    	   
	  @RequestMapping(value="/welcome")
	  public ModelAndView doGet(@ModelAttribute ("student") Student student){
	   		
		  return procedRequest(student);

	   	}

	     


	
     

       public ModelAndView procedRequest(
    		   @ModelAttribute ("student") Student student   )
		 {
		
		
		boolean yesorno = false;

		
		yesorno = studentService.checkUserInDatabase(student);
		if (yesorno) {
			 /*Student student2 = studentService.get(student.getName());
			String ime=(student2.getName());*/
			ModelAndView model=new ModelAndView("success");
			 
			model.addObject("message","welcome u mvc");
			return model;
		} else {
			ModelAndView model=new ModelAndView("index");
			model.addObject("message","Sorry wrong data!<button type='button' class='btn btn-info btn-xs' data toggle'modal' data-target='#myModal'>register</button>");
			return model;
			
		}

	}
       @ModelAttribute
       public void headerMessage(Model model){
    	   model.addAttribute("headerMessage","moj probni rad");
    	   
       }
       @RequestMapping(value="/videos")
       public ModelAndView leadToTheVideos( @ModelAttribute ("student") Student student){
    	   ModelAndView model=new ModelAndView("videos");
    	   return model;
       }
       @RequestMapping(value="/logout")
       public ModelAndView backOut( @ModelAttribute ("student") Student student){
    	   ModelAndView model=new ModelAndView("logout");
    	   return model;
       }
       @RequestMapping(value = "/new", method = RequestMethod.GET)
       public ModelAndView newUser() {
           ModelAndView model = new ModelAndView("StudentForm");
           model.addObject("student", new Student());
           return model; 
       }
       @RequestMapping(value = "/save", method = RequestMethod.POST)
       public ModelAndView saveUser(@ModelAttribute ("student") Student student) {
    	   studentService.saveOrUpdate(student);
           return new ModelAndView("redirect:/");
       }  
       @RequestMapping("/list")
       public ModelAndView handleRequest() throws Exception {
           List<Student> listaStudenata = studentService.list();
           ModelAndView model = new ModelAndView("StudentList");
           model.addObject("studentList", listaStudenata);
           return model;
       }
       @RequestMapping(value = "/edit", method = RequestMethod.GET)
       public ModelAndView editUser(HttpServletRequest request) {
           //String email = Integer.parseInt(request.getParameter("email"));
           String name = request.getParameter("name");
           Student student = studentService.get(name);
           System.out.println(student);
           ModelAndView model = new ModelAndView("StudentForm");
           model.addObject("student", student);
           return model;      
       }
        
       @RequestMapping(value = "/delete", method = RequestMethod.GET)
       public ModelAndView deleteUser(HttpServletRequest request) {
           int userId = Integer.parseInt(request.getParameter("id"));
        //   userDao.delete(userId);
           return new ModelAndView("redirect:/");     
       }
}
