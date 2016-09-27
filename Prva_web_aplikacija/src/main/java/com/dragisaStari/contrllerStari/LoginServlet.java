package com.dragisaStari.contrllerStari;
/*package com.dragisa.contrllerStari;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragisa.model.User;
import com.dragisa.sevice.UserService;

*//**
 * Servlet implementation class LoginServlet
 *//*
@WebServlet("/loginServletPah")

public class LoginServlet  extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	String user, pasos;
	UserService us = new UserService();
	*//**
	 * @see HttpServlet#HttpServlet()
	 *//*
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 * response.getWriter().append("Served at: "
		 * ).append(request.getContextPath());
		 
		procedRequest(request, response);
	}

	
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		procedRequest(request, response);
		
	}

	protected void procedRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		
		user = request.getParameter("userName");
		pasos = request.getParameter("uspassword");
		PrintWriter out = response.getWriter();
		
		 * out.print("<html><body><h1>Zdravo <br/>  "+user+
		 * "<br/>tvoj password je  "+pasos+"</h1></body></html>");
		 
		boolean yesorno = false;
		
		if (user != null && pasos != null)
			yesorno=us.canYouMakeUserObject(user, pasos);
		if (yesorno){ 
			out.print("<p style='color:blue'>Zdravo ,</br>" + user + "</br>you loged in!!!!!</p>");
		  User korisnik=us.gerUserObject(pasos);
		  request.getSession().setAttribute("korisnik", korisnik);
		  request.getRequestDispatcher("Views/success.jsp").forward(request, response);
		  
		 Cookie cookie=new Cookie("korisnik",korisnik.getKorisnikName());
		 response.addCookie(cookie);
		 
		 response.sendRedirect("Views/success.jsp");
		 return;
		}
			else 
			{
				 request.setAttribute("message","losi podaci");
				 
				 request.getRequestDispatcher("").forward(request, response);
				 request.getSession().setAttribute("message","losi podaci");
				  response.sendRedirect("index.jsp");
				
			out.print("<p style='color:red'>Sorry nisu dobri podaci</p>");
			}

	}
}
*/