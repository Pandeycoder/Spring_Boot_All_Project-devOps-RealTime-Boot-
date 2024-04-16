package com.coder.service;

import java.util.List;

import com.coder.entity.Ticket;
import com.coder.request.Passanger;

public interface TicketService {

	public Ticket bookTicket(Passanger passanger);

	public Ticket getTicket(Integer ticketNum);
	
	public List<Ticket> getAllTickets();
}
