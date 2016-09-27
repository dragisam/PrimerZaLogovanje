<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Issssss</title>
</head>
<body>
	<%-- <%
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setDateHeader("Expires", 0);
		response.setHeader("Pragma", "no-cache");
		if (session.getAttribute("korisnik") == null)
			response.sendRedirect("../");
	%> --%>
	<%-- ${headerMessage} --%>
	
	<!-- <a href="logout.jsp">logout</a> -->
	<form action="logout" >
    <input type="submit"  value="logout">
  </form>  
	<h1>Dobro dosli u video</h1>

</body>
</html>