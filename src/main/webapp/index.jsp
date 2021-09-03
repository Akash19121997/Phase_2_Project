<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body>
<h3 align="center" style="color: red">Welcome to FlyAway( An Airline Booking Portal )</h3><br>
<form action="BookingDetails" method="post">
       Enter Source:<input type="text" name="source"> <br>
       Enter Destination:<input type="text" name="destination"><br>
       Enter Number of Tickets:<input type="number" name="ticket"><br>
       <input type="submit" value="Click here to Proceed">
</form>

   <a href="AdminLogin.jsp">For Admin Login Click Here</a>
</body>
</html>