<%-- <%@page import="com.dragisa.model.Student"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <%-- <h4>${headerMessage}</h4> --%>
	<h1 style="color: blue">
		  Zdravo, ${student2.getEmail()} ulogovao si se!!!</br>
	</h1>
<form action="videos" >
    <input type="submit"  value="videos">
  </form>  
	<a href="logout">logout</a>
	<h1 style="color: blue">
			
			<%-- ${requestScope.message} --%>
		</h1>
</body>
</html>