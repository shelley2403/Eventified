package com.system.ems.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.ems.dao.SearchFriendsDao;
import com.system.ems.pojo.User;

@Controller
public class SearchFriendsController {
	
	@RequestMapping(value="/searfri.htm", method=RequestMethod.GET)
	protected ModelAndView searchFriMethod(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String reqName= request.getParameter("searchfrns");
		
		SearchFriendsDao sfd=new SearchFriendsDao();
		ArrayList<User>peopleList=sfd.lookUpFriendsMethod(reqName);
		if(peopleList!=null){
			HttpSession session6 = request.getSession();
			session6.setAttribute("peopleList", peopleList);
			return new ModelAndView("User");
		}
		
		return new ModelAndView("Signupfail");
	}

}
