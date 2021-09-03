<%@page import="com.dto.User"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDAOImpl"%>
<%@page import="com.dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
<table class="table table-hover" id="userTable">
   <%
   	UserDAO userDao=new UserDAOImpl();
   	List <User> users=userDao.listUsers();
   	
   	if (users.size()>0)
   	{
   		out.print("<thead><tr><th>Id</th><th>Name</th><th>Email</th><th>UserName</th></tr></thead>");
   		out.print("<tbody>");
   		for (User x:users){
   			out.print("<tr>");
   			out.print("<td>"+x.getId()+"</td>"); 
   			out.print("<td>"+x.getName()+"</td>");
   			out.print("<td>"+x.getEmail()+"</td>");
   			out.print("<td>"+x.getUsername()+"</td>");
   			out.print("</tr>");
   		}
   		out.print("</tbody>");
    	}
    String ID=request.getParameter("ID");
    if(ID!=null)
    {
    	out.print("<div class='alert alert-success' role='alert'>A Record has been added with the id: "+ID+"</div>");
    }
   %>
   
  </table>


</body>
</html>