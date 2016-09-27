package com.dragisaStari.contrllerStari;
/*package com.dragisa.contrllerStari;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dragisa.model.User;
import com.dragisa.sevice.UserService;
import com.sun.javafx.collections.MappingChange.Map;

*//**
 * Servlet implementation class LoginServlet
 *//*
@Controller
@RequestMapping("/loginController")
public class LogincController  {
	@Autowired
	User user;
	UserService us = new UserService();

	*//**
	 * @see HttpServlet#HttpServlet()
	 *//*
	public LogincController() {
		super();
		// TODO Auto-generated constructor stub
	}
	  @RequestMapping(value="/welcome")
	   	protected void doGet(@RequestParam Map<String,String> params,ModelMap model)
	   			 {
	   		// TODO Auto-generated method stub
	   		procedRequest(params, model);

	   	}

	       @RequestMapping(value="/welcome",method=RequestMethod.POST)
		protected void doPost(@RequestParam Map<String,String> params,ModelMap model)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
	    	   procedRequest(params, model);


		}
	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
@RequestMapping(value="/handleloginRequest",method=RequestMethod.POST)
public String handleloginRequest
      (
    		  @RequestParam Map<String,String> params,
    		  
    		   @RequestParam("userName") String Name,
    		  @RequestParam("uspassword") String password,
    		  
    		  ModelMap model){
         
           String name=params.get("userName");
           String password=params.get("uspassword");
         
           model.put("message","xdravo "+ name+"tvoj pasos je"+password);
           

HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
		// TODO Auto-generated method stub
		
		 * response.getWriter().append("Served at: "
		 * ).append(request.getContextPath());
		 
		procedRequest(request, response);
		//System.out.println("moji divni sinovi");
		model.put("username", Name);
		model.put("uspassword",password);
	 model.put("message","xdravo "+ Name+"tvoj pasos je"+password);
		
		return "hello";
			}
       @RequestMapping(name="/userName/{name}/uspassword/{password}")
		public String takesPathVariables(@PathVariable ("userName") String Name,@PathVariable("uspassword") String password,ModelMap model)	{
    	   
    	   model.put("username", Name);
   		model.put("uspassword",password);
          
			 model.put("message","xdravo "+ Name+"tvoj pasos je"+password);
			return "hello";
		}
	

	
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 
     

	protected void procedRequest(@RequestParam Map<String,String> params,ModelMap model)
		 {
		String userName=params.map(user.getUserName());
		String password=params.map(user.getUspassword());
		
		 * out.print("<html><body><h1>Zdravo <br/>  "+user+
		 * "<br/>tvoj password je  "+pasos+"</h1></body></html>");
		 
		boolean yesorno = false;

		if (user != null && password != null)
			yesorno = us.canYouMakeUserObject(user, password);
		if (yesorno) {
			
			 * out.print("<p style='color:blue'>Zdravo ,</br>" + user +
			 * "</br>you loged in!!!!!</p>");
			 
			User korisnik = us.gerUserObject(password);
			model.addAttribute(user).setAttribute("korisnik", korisnik);
			
			 * request.getRequestDispatcher("Views/success.jsp").forward(
			 * request, response);
			 

			
			 * Cookie cookie=new Cookie("korisnik",korisnik.getKorisnikName());
			 * response.addCookie(cookie);
			 

			model.sendRedirect("Views/success.jsp");
			return;
		} else {
			model.setAttribute("message", "losi podaci");

			params.getRequestDispatcher("").forward(request, response);
			
			 * request.getSession().setAttribute("message","losi podaci");
			 * response.sendRedirect("index.jsp");
			 

			 out.print("<p style='color:red'>Sorry nisu dobri podaci</p>"); 
		}

	}
}
*/