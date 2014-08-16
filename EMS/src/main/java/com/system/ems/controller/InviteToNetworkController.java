package com.system.ems.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.ems.dao.InviteToNetworkDao;
import com.system.ems.dao.ManageNotificationsDao;
import com.system.ems.pojo.Notification;
import com.system.ems.pojo.User;

@Controller
public class InviteToNetworkController {

	@RequestMapping(value="/lsd.htm", method=RequestMethod.GET)
	protected ModelAndView inviteMethod(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		HttpSession session2 = request.getSession();
		User userDetails=(User)session2.getAttribute("userReturned");
		
		int friendId= Integer.parseInt(request.getParameter("friendId"));
		
		InviteToNetworkDao itnd = new InviteToNetworkDao();
		Boolean reply=itnd.inviteToNetworkMethod(friendId, userDetails);
		
		ManageNotificationsDao mnd = new ManageNotificationsDao();
		Boolean reply1=mnd.notifyFriendRequest(friendId, userDetails);
		ArrayList<Notification> notiList = mnd.checkNotifications(userDetails);
		
		if(reply||(!notiList.isEmpty())||reply1){
			HttpSession session5 = request.getSession();
			session5.setAttribute("notiList", notiList );
			return new ModelAndView("User");
		}
    	else{
    		return new ModelAndView("Hello123");
		
    	}
	}
	
	
}
