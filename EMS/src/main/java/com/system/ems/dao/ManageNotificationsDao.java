package com.system.ems.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.system.ems.pojo.Event;
import com.system.ems.pojo.Friends;
import com.system.ems.pojo.FriendsId;
import com.system.ems.pojo.Notification;
import com.system.ems.pojo.User;

public class ManageNotificationsDao {

	public boolean notifyFriendRequest(int friendId, User userDetails){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
		
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
		
	        User friendReturned = (User)session.get(User.class, friendId);
			
			
			Notification noti = new Notification();
			noti.setDescription("FRIENDrEQ");
			//You have received a friend Request from '"+friendReturned.getFirstName()+"' '"+friendReturned.getLastName()+"'"
		
			noti.setFriendId(friendReturned.getUserId());
			noti.setUsers(userDetails);
			noti.setNotType("friendRequest");
			
			session.save(noti);
			session.getTransaction().commit();
			
	        return true;
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    
	    return false;
	
	}
	
	
	
	
	public ArrayList<Notification> checkNotifications(User userDetails){
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
		
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	        
	        
	        Query q = session.createQuery("from Notification where userId="+userDetails.getUserId());
	        q.setMaxResults(3);
	        System.out.println(q);
	        ArrayList<Notification> notificationList = null;
	        
	        if(!q.list().isEmpty()){
	        	notificationList= (ArrayList<Notification>)q.list();
	        	return notificationList;
	       
	        }
	        
	    }catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
	    return null;
	
	}
}
