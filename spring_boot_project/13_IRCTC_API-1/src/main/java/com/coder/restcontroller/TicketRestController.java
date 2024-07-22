package com.coder.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coder.entity.Ticket;
import com.coder.request.Passanger;
import com.coder.service.TicketService;

@RestController
public class TicketRestController {

	@Autowired
	private TicketService service;

	@PostMapping(path = "/Book-ticket", consumes = {"application/xml","application/json"}, produces = {"application/json","application/xml"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger passanger) {

		Ticket ticket = service.bookTicket(passanger);

		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

	
	@GetMapping(path = "/search-ticket/{ticketNum}", produces = {"application/xml","application/json"})
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNum") Integer ticketNum) {

		Ticket ticket = service.getTicket(ticketNum);
		
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
	
	
	

	@GetMapping(path= "/show-tickets", produces = { "application/xml","application/json"})
	public ResponseEntity<List<Ticket>> getAllTicket() {

		
		List<Ticket> ticket = service.getAllTickets();
		
		
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
	


}
