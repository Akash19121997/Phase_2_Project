<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
<h1>Give User Details</h1><br>
      <form action ="UserControllerServlet" action="post">
      <input type ="text" name="name" placeholder="Name"/><br/>
      <input type ="text" name="email" placeholder="Email"/></br>
      <input type ="text" name="username" placeholder="User Name"/></br>
       <input type ="text" name="password" placeholder="Password"/>
        <input type="Submit" value="Register"/>
         
      </form>
      
</body>
</html>