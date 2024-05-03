package com.coder.service;

import java.util.List;

import com.coder.request.Passanger;
import com.coder.response.Ticket;

import reactor.core.publisher.Mono;

public interface MakeMyTripService {

	
	public Mono<Ticket> bookTicket(Passanger passanger);
	
	public Mono<Ticket[]> getAllTicket();
	
	public Mono<Ticket> findTicket(Integer ticketNum);
	
	
}
