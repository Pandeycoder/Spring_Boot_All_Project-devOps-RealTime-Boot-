package com.coder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coder.request.Passanger;
import com.coder.response.Ticket;
import com.coder.service.MakeMyTripService;

@Controller
public class MakeMyTripControlle {
	
	@Autowired
	private MakeMyTripService service;
	
	@GetMapping("/")
	public String bookTicket(Model model)
	{
		model.addAttribute("passanger", new Passanger());
		
		return "index";	
	}
	
	@GetMapping("/search")
	public String search(Model model)
	{
	
		model.addAttribute("ticket", new Ticket());
		return "search";	
	}
	
	
	@PostMapping("/ticket")
	public String handleBookTicketBtn(@ModelAttribute("passanger") Passanger passanger ,Model model)
   {
	
		Ticket ticket=service.bookTicket(passanger);
		
		model.addAttribute("ticket",ticket);
	  
		return "view-ticket";
    }
	
	
	@PostMapping("/search")
	public String handleBookTicketBtnSearch(@RequestParam("ticketNum") Integer ticketNum ,Model model)
   {
	
		Ticket ticket=service.findTicket(ticketNum);
		
		model.addAttribute("ticket",ticket);
	  
		return "search";
    }
	
	
	@GetMapping("/tickets")
	public String viewTicket(Model model)
	{
		
		     List<Ticket> tickets=service.getAllTicket();
		
		
		
				model.addAttribute("tickets", tickets);
		
		return "data";	
	}
	
	
	
	
	
	

}
