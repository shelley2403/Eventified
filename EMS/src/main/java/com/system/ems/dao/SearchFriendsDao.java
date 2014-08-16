package com.system.ems.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.system.ems.pojo.User;

public class SearchFriendsDao {
	
public ArrayList<User> lookUpFriendsMethod(String name){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
		
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	        Query q = session.createQuery("from User where firstName LIKE %'"+name+ "'% or lastName LIKE % '"+name+"'%");
	        System.out.println(q);
	        if(!q.list().isEmpty()){
	        	ArrayList<User> peopleList=(ArrayList<User>)q.list();
	        	return peopleList;
	        }
	        
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    
	    return null;
	}

}
