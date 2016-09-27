<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">


	<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" media="screen">
<title>Insert title here</title>
</head>
<body>
<script src="webjars/jquery/2.2.3/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<div class="container">
	 <h1 style="color:red;" align="right">
			
			${requestScope.message}
		</h1>
		<h1>volim jesenje sunce</h1>
		<form action="welcome" metod="POST" class="form-inline">
		  <div class="form-group">
			<label>userName </label> 
			<input type="text" name="email" class="form-control" placeholder="email"><br />
			</div>
			
			<div class="form-group">
			<label>password</label>
			 <input type="password" name="password" class="form-control" placeholder="password"><br />
			</div>
			 <div class="form-group">
			<label>Name </label> 
			<input type="text" name="name" class="form-control" placeholder="email"><br />
			</div>
			<br /> <input type="submit" class="btn btn-default" value="logIn">
		</form>
		<form action="list" >
    <input type="submit"  value="lista">
  </form>  
		
	</div>
	


</body>
</html>