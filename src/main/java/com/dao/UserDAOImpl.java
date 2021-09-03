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

import com.dto.User;

public class UserDAOImpl implements UserDAO {

	
		private SessionFactory factory;
	    
	    public UserDAOImpl() {
	        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	        factory = meta.getSessionFactoryBuilder().build();

	    }

	

	@Override
	public Integer addUser(User user) {
		Integer userId=null;
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		userId=(Integer) session.save(user);
		txn.commit();
		session.close();
		return userId;
	}

	@Override
	public List<User> listUsers() {
		List <User> users=null;
		
		Session session=factory.openSession();
		Transaction txn=session.getTransaction();
		String hql="FROM User";
		TypedQuery<User> query=session.createQuery(hql);
		
		users=query.getResultList();
		return users;
	}

	

	
}
