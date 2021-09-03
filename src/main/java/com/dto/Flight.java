package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {
		@Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	    @Column(name="id")
	private int id;
		@Column(name="airline")
	private String airline;
		@Column(name="source")
	private String source;
		@Column(name="destination")
	private String destination;
		@Column(name="fair")
	private int fair;
	public Flight() {
		
	}
	
	public Flight( String airline, String source, String destination, int fair) {
		super();
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fair = fair;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFair() {
		return fair;
	}
	public void setFair(int fair) {
		this.fair = fair;
	}

	
}
