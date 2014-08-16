package com.system.ems.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.ems.dao.EventDao;
import com.system.ems.pojo.Event;


@Controller
public class EventController 
{
	@RequestMapping(value="/qwe.htm", method=RequestMethod.POST)
	protected ModelAndView eventCreation(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String eventitle= request.getParameter("eventitle");
		String eventype= request.getParameter("eventype");
		String eventdesc= request.getParameter("eventdesc");
		
		DateFormat df = new SimpleDateFormat("MM-DD-YYYY");
		Date eventdate= df.parse(request.getParameter("eventdate"));
		
		DateFormat df2 = new SimpleDateFormat("hh:mm:ss");
    	Date eventime = (df2.parse(request.getParameter("eventime")));
    	
    	String venue = request.getParameter("eventvenue");
    	String location = request.getParameter("venuelocation");
    	
    	
    	EventDao ed = new EventDao();
    	
    	Boolean reply = ed.eventCreate(eventitle, eventdesc, eventype, eventdate, eventime, venue, location);
    	
    	if(reply)
    	
    	return new ModelAndView("Hello");
    	else
    		return new ModelAndView("Hello123");
}
	
	@RequestMapping(value="/eventBrowse.htm", method=RequestMethod.GET)
	protected ModelAndView eventCatalog(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		
		EventDao ed = new EventDao();
		ArrayList<Event> eventDetails=ed.eventDetails();
		System.out.println(eventDetails);
		if(eventDetails!=null){
			request.setAttribute("eventDetails", eventDetails);
			return new ModelAndView("Events");
		}
    	else{
    		return new ModelAndView("Hello123");
		
    	}
	}
	
}
