package com.system.ems.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.ems.dao.EventDao;
import com.system.ems.dao.TicketDetailsDao;
import com.system.ems.pojo.*;

@Controller
public class TicketDetailsController {
	
	@RequestMapping(value="/attendEvent.htm", method=RequestMethod.GET)
	protected ModelAndView eventTicketDetails(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		int eventIdObtained= Integer.parseInt(request.getParameter("eventId"));
		
		EventDao ed = new EventDao();
			Event eventReturned=ed.returnEventFromId(eventIdObtained);
			
			TicketDetailsDao tdd = new TicketDetailsDao();
			ArrayList<TicketType> tt=tdd.returnTicketTypeFromId(eventIdObtained);
			 
			if(eventReturned!=null){
				HttpSession session3 = request.getSession();
				
				session3.setAttribute("eventDetails", eventReturned);
				session3.setAttribute("tt", tt);
			return new ModelAndView("TicketDetails");
			}else{
				
				return new ModelAndView("NahiHoPayenga");
			}
	}
}
