package com.system.ems.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.ems.dao.SignupDao;
import com.system.ems.pojo.User;

@Controller
public class SignupController {

	@RequestMapping(value="/xyz.htm", method=RequestMethod.GET)
	protected ModelAndView signupMethod(HttpServletRequest request, HttpServletResponse response){
		
		String username= request.getParameter("username");
		String password = request.getParameter("password");
		String email= request.getParameter("password");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		boolean policyCheckBox = Boolean.parseBoolean(request.getParameter("policy"));
		
		if(policyCheckBox){
			
			SignupDao sud = new SignupDao();
			User user=sud.singnUpCustomer(username, password, email, firstName, lastName);
			if(user!=null){
				
				HttpSession session = request.getSession();
				session.setAttribute("firstname", user.getFirstName());
				session.setAttribute("user", user);
				return new ModelAndView("User");
				
				}
		}
		
		return new ModelAndView("Signupfail");
	}
}
