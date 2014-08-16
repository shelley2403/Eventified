package com.system.ems.dao;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.system.ems.pojo.Event;
import com.system.ems.pojo.User;
import com.system.ems.pojo.UserHasEvents;

public class EventDao {
	
public boolean eventCreate(String eventitle, String eventdesc, String eventype, Date eventDate, Date eventStarts, String venue, String location){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
	   
		
		
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	        Event e = new Event();
	
	        e.setStartDate(eventStarts);
			e.setTitle(eventitle);
			e.setEventype(eventype);
			e.setDescription(eventdesc);
			e.setStartTime(eventDate);
			e.setVenue(venue);
			e.setLocation(location);
	        
	        User user = (User)session.get(User.class, 1);
	        
	        UserHasEvents userhasevents = new UserHasEvents();
	        userhasevents.setUser(user);
	        userhasevents.setEvent(e);
	        userhasevents.setUserRole("Owner");
	        
	        e.getUserhasevents().add(userhasevents);
	     
	        session.save(e);
	     
	        session.getTransaction().commit();
	        return true;
	       
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    
	
	    return false;
	}

	public ArrayList<Event> eventDetails(){
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");// populates the data of the
	
	// creating session factory object
    SessionFactory factory = cfg.buildSessionFactory();

    // creating session object
    Session session = factory.openSession();
    
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Event");
        q.setMaxResults(10);
        System.out.println(q);
        ArrayList<Event> eventlist = null;
        if(!q.list().isEmpty()){
        	System.out.println(q);
        	eventlist= (ArrayList<Event>)q.list();
        	return eventlist;
        }
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
	
    return null;
	}
	
	
	public Event returnEventFromId(int eventId){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
		
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	        Query q = session.createQuery("from Event where eventId= "+ eventId);
	        System.out.println(q);
	        
	        Event eventReturned = null;
	        if(!q.list().isEmpty()){
	        	
	        	eventReturned=(Event)q.list().get(0);
	        	return eventReturned;
	        }
	        
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
	    return null;
		}

}
