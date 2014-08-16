package com.system.ems.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.ems.pojo.Event;
import com.system.ems.pojo.TicketType;

@Controller
public class TicketProcessController {

	@RequestMapping(value="/ProcessTicketing.htm", method=RequestMethod.POST)
	protected ModelAndView processTicketDetails(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		HttpSession session4 = request.getSession();
		Event e = (Event)session4.getAttribute("e");
		
		ArrayList<TicketType> ticketDetailsList = new ArrayList<TicketType>();
		
		int i = Integer.parseInt(request.getParameter("valueOfi"));
		
		System.out.println("ef"+i);
		
		for(int j=1; j<=i; j++){
			
			System.out.println("efwefwefwfewfwefwefwe");
			String ticketName = request.getParameter("ttype"+j);
			int quantityPurchased = Integer.parseInt(request.getParameter("purchaseQnty"+j));
			int priceOfTicket = Integer.parseInt(request.getParameter("tprice"+j));
			
			TicketType ttype = new TicketType();
			ttype.setTicketName(ticketName);
			ttype.setQuantity(quantityPurchased);
			ttype.setPrice(priceOfTicket);
			ttype.setEvent(e);
			
			ticketDetailsList.add(ttype);
			
		}
		
		request.setAttribute("ticketDetailsList", ticketDetailsList);
		return new ModelAndView("PaymentDetails");
		
	}
	
}
