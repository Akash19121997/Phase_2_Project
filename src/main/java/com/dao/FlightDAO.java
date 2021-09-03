package com.dao;

import java.util.List;

import com.dto.Flight;

public interface FlightDAO {
	 public Integer addFlight(Flight flight);
	    //public void updateFlight(Integer flightID, String password );
	   
	    public List<Flight> listFlights();
	    
}
