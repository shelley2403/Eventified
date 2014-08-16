package com.system.ems.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.system.ems.pojo.*;


public class InviteToNetworkDao {

public boolean inviteToNetworkMethod(int friendId, User userDetails){
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
		
		// creating session factory object
	    SessionFactory factory = cfg.buildSessionFactory();

	    // creating session object
	    Session session = factory.openSession();
	    
	    try {
	        org.hibernate.Transaction tx = session.beginTransaction();
	    
	   
	        User friendReturned = (User)session.get(User.class, friendId);
	        
	        FriendsId friendId1 = new FriendsId(userDetails.getUserId(), friendReturned.getUserId());
            Friends friend1 = new Friends();
            friend1.setId(friendId1);
			friend1.setStatus(0);
			session.save(friend1);
			
			//System.out.println(MyEnum.VALUE1.ordinal());
            
	   //    User friendReturned = (User)session.get(User.class, friendId);
	   //    userDetails.getFriends().add(friendReturned);
	   
/*	       UserHasFriends uhf = new UserHasFriends();
	       
	       uhf.setRequestStatus("approved");
	       User usersFriend = (User)session.get(User.class, friendId);
	       System.out.println("Herewkfwegred"+usersFriend.getUniqueNo());
	       uhf.setFriendId(usersFriend.getUniqueNo());
	       
	       User user = new User();
	       user.setUserId(userDetails.getUserId());
	       uhf.setUser(user);
	       
	//       uhf.getUfi().setUserId(userDetails.getUserId());
	//       User usersFriend = (User)session.get(User.class, 2);
	//       uhf.getUfi().setFriendId(usersFriend.getUniqueId());
	       
	//      uhf.setUser(userDetails);
	     
	        session.save(uhf);*/
	        session.getTransaction().commit();
			
	        return true;
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    
	    return false;
	}
	        
}
