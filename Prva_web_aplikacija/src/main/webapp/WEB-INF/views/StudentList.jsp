<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Lista studenata</h1>
            <h2><a href="new">novi student</a></h2>
             
            <table border="1">
                <th>No</th>
                <th>name</th>
                <th>Email</th>
                <th>Actions</th>
                 
                <c:forEach var="student" items="${studentList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td width="200">${student.name}</td>
                    <td width="200" align="centar"> ${student.email}</td>
                    <td>
                        <a href="edit?name=${student.name}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${student.email}">Delete</a>
                    </td>
                </tr>
                </c:forEach>             
            </table>
        </div>
        <h2><a href="">pocetak</a></h2>
    </body>
</html>