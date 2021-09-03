package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.loader.custom.sql.SQLCustomQuery;

import com.dto.Flight;

public class FlightDAOImp implements FlightDAO {
	private SessionFactory factory;
    
    public FlightDAOImp() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        factory = meta.getSessionFactoryBuilder().build();

    }

public List<Flight> searchFlight(String Source, String Destination) {
     List <Flight> flights=null;
	
	Session session=factory.openSession();
	Transaction txn=session.getTransaction();
	String hql="FROM Flight where source is :Source and destination is :Destination";
	TypedQuery<Flight> query=session.createQuery(hql);
	query.setParameter("Source", Source);
	query.setParameter("Destination", Destination);
	
	flights=query.getResultList();
	return flights;
}

@Override
public Integer addFlight(Flight flight) {
	Integer flightId=null;
	Session session=factory.openSession();
	Transaction txn=session.beginTransaction();
	flightId=(Integer) session.save(flight);
	txn.commit();
	session.close();
	return flightId;
}


@Override
public List<Flight> listFlights() {
	List <Flight> flights=null;
	
	Session session=factory.openSession();
	Transaction txn=session.getTransaction();
	String hql="FROM Flight order by id ";
	TypedQuery<Flight> query=session.createQuery(hql);
	
	flights=query.getResultList();
	return flights;
}
public List<String> listAirline() {
	List <String> airline=null;
	
	Session session=factory.openSession();
	Transaction txn=session.getTransaction();
	String hql="SELECT distinct E.airline FROM Flight E";
	TypedQuery<String> query=session.createQuery(hql);
	
	airline=query.getResultList();
	return airline;
}


public List<String> listSource() {
	List <String> names=null;
	
	Session session=factory.openSession();
	Transaction txn=session.getTransaction();
	String hql="SELECT distinct E.source FROM Flight E";
	TypedQuery<String> query=session.createQuery(hql);
	
	names=query.getResultList();
	return names;
}
public List<String> listDestination() {
	List <String> names=null;
	
	Session session=factory.openSession();
	Transaction txn=session.getTransaction();
	String hql="SELECT E.destination FROM Flight E";
	TypedQuery<String> query=session.createQuery(hql);
	
	names=query.getResultList();
	return names;
}
}
