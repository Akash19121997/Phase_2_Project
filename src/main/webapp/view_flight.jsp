<%@page import="com.dto.Flight"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.FlightDAOImp"%>
<%@page import="com.dao.FlightDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Flight</title>
</head>
<body>
<table class="table table-hover" id="userTable">
   <%
   	FlightDAO flightDao=new FlightDAOImp();
   	List <Flight> flights=flightDao.listFlights();
   	
   	if (flights.size()>0)
   	{
   		out.print("<thead><tr><th>Id</th><th>AirName</th><th>Source</th><th>Destination</th><th>Fair</th></tr></thead>");
   		out.print("<tbody>");
   		for (Flight x:flights){
   			out.print("<tr>");
   			out.print("<td>"+x.getId()+"</td>"); 
   			out.print("<td>"+x.getAirline()+"</td>");
   			out.print("<td>"+x.getSource()+"</td>");
   			out.print("<td>"+x.getDestination()+"</td>");
   			out.print("<td>"+x.getFair()+"</td>");
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