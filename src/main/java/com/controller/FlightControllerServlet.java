package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDAO;
import com.dao.FlightDAOImp;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.dto.Flight;
import com.dto.User;

/**
 * Servlet implementation class FlightControllerServlet
 */
public class FlightControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Airline=request.getParameter("airline");
		String Source=request.getParameter("source");
		String Destination=request.getParameter("destination");
		int Fair=Integer.parseInt(request.getParameter("fair"));
		
	 FlightDAO flightdao=new FlightDAOImp();
	 
	 Flight f1=new Flight(Airline,Source,Destination,Fair);
	 
	 int Id=flightdao.addFlight(f1);
	 
	 response.sendRedirect("AdminSuccess.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
