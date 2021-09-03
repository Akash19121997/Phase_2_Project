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
<title>List of Airline</title>
</head>
<body>
<body>
<table class="table table-hover" id="userTable">
   <%
   	FlightDAOImp flightDao=new FlightDAOImp();
   	List <String> airline=flightDao.listAirline();
   	
   	if (airline.size()>0)
   	{
   		out.print("<thead><tr><th>AirName</th></tr></thead>");
   		out.print("<tbody>");
   		for (String x:airline){
   			out.print("<tr>");
   			out.print("<td>"+x+"</td>"); 
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