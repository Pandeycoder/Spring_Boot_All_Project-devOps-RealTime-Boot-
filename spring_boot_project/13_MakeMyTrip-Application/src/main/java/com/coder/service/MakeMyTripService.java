package com.coder.service;

import java.util.List;

import com.coder.request.Passanger;
import com.coder.response.Ticket;

public interface MakeMyTripService {

	
	public Ticket bookTicket(Passanger passanger);
	
	public List<Ticket> getAllTicket();
	
	
	public Ticket findTicket(Integer ticketNum);
	
	
	
}
