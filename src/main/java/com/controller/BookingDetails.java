package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDAOImp;
import com.dto.Flight;

/**
 * Servlet implementation class BookingDetails
 */
public class BookingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String source= request.getParameter("source");
		System.out.println(source);
		String destination=request.getParameter("destination");
		String ticket=request.getParameter("ticket");
		FlightDAOImp flightdao=new FlightDAOImp();
		List <Flight> f=flightdao.searchFlight(source,destination);
		
		PrintWriter out=response.getWriter();
		for(Flight f1:f) {
		out.println("<h1>Available Flight</h1>");
		out.println("Airline :"+f1.getAirline()+"<br>");
		out.println("Source :"+f1.getSource()+"<br>");
		out.println("Destination :"+f1.getDestination()+"<br>");
		out.println("Total Fair :"+f1.getFair()*Integer.parseInt(ticket)+"<br><br>");
		out.print("<a href=RegisterUser.jsp>Click Here To Book Ticket</a>");
		}
		//response.sendRedirect("RegisterUser.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
