package com.system.ems.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.system.ems.pojo.User;

public class SigninDao {
	
	public User loginCustomer(String username, String password){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
	   
		
		
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		
		
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	        Query q = session.createQuery("from User where username = '"+username+ "' and password = '"+password+"'");
	        System.out.println(q);
	        if(!q.list().isEmpty()){
	        	User user=(User)q.list().get(0);
	        	return user;
	        }
	        
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
	    return null;
		}

}
