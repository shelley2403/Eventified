package com.system.ems.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.system.ems.pojo.TicketType;

public class TicketDetailsDao {

public ArrayList<TicketType> returnTicketTypeFromId(int eventId){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
		
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	        Query q = session.createQuery("from TicketType where eventId= "+ eventId);
	       
	        
	        ArrayList<TicketType> ticketListReturned = null;
	        if(!q.list().isEmpty()){
	        	
	        	ticketListReturned=(ArrayList<TicketType>)q.list();
	        	return ticketListReturned;
	        }
	        
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
	    return null;
		}
}
