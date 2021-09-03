<%@page import="java.util.List"%>
<%@page import="com.dao.FlightDAOImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Source And Destination</title>
<table class="table table-hover" id="userTable">
   <%
   	FlightDAOImp flightDao=new FlightDAOImp();
   	List <String> source=flightDao.listSource();
   	
   	if (source.size()>0)
   	{
   		out.print("<thead><tr><th>Source & Destination</th></tr></thead>");
   		out.print("<tbody>");
   		for (String x:source){
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
</head>
<body>

</body>
</html>