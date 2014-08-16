package com.system.ems.dao;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.system.ems.pojo.User;

public class SignupDao {
	
	SecureRandom random = new SecureRandom();
	public String nextSessionId() {
		
	    return new BigInteger(130, random).toString(32);
	 }

public User singnUpCustomer(String username, String password,String email,String firstname,String lastname){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
	   
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setFirstName(firstname);
		u.setLastName(lastname);
		u.setUniqueNo(nextSessionId());
	
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	        Query q = session.createQuery("from User where username = '"+username+ "' or email = '"+email+"'");
	      
	        if(q.list().isEmpty()){
	        	session.save(u);
	            session.getTransaction().commit();
	        	return u;
	        }
	        
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
	    return null;
		}
	    
}


