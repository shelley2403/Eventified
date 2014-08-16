package com.system.ems.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.ems.dao.SigninDao;
import com.system.ems.pojo.User;


@Controller
public class SigninController {

	@RequestMapping(value="/abc.htm", method=RequestMethod.GET)
	protected ModelAndView loginMethod(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String username= request.getParameter("uname");
		String password = request.getParameter("pass");
		boolean myCheckBox = Boolean.parseBoolean(request.getParameter("rememberMe"));
				
		if(myCheckBox==(true)){
	           
	           Cookie cookie1=new Cookie("username",username);
	           Cookie cookie2=new Cookie("password",password);
	           cookie1.setMaxAge(7 * 24 * 60 * 60);
	           cookie2.setMaxAge(7 * 24 * 60 * 60);
	           response.addCookie(cookie1);
	           response.addCookie(cookie2);
	        }
				
		SigninDao sid = new SigninDao();
		User userReturned =sid.loginCustomer(username, password);
		
		if(userReturned!=null){
		
		HttpSession session = request.getSession();
		session.setAttribute("firstName", userReturned.getFirstName());
		session.setAttribute("userReturned",userReturned);
		
		return new ModelAndView("User");
		
		}else{
			
			return new ModelAndView("LoginFail");
		}
	}
}
