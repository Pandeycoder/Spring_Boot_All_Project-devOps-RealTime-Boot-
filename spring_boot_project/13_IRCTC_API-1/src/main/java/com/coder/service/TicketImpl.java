package com.coder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coder.entity.Ticket;
import com.coder.repository.TicketRepo;
import com.coder.request.Passanger;

@Service
public class TicketImpl implements TicketService {

	@Autowired
	private TicketRepo ticketRepo;
	
	@Override
	public Ticket bookTicket(Passanger passanger) {
		// TODO Auto-generated method stub
		
		Ticket ticket=new Ticket();
		BeanUtils.copyProperties(passanger, ticket);
		
		ticket.setPrice(1500.23);
		ticket.setTicketStatus("confirmed");
		
		//db
		ticket=ticketRepo.save(ticket);
		
		return ticket;
	}

	
	@Override
	public Ticket getTicket(Integer ticketNum) {
		// TODO Auto-generated method stub
		
		
		Optional<Ticket> findById=ticketRepo.findById(ticketNum);
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}


	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		
		return ticketRepo.findAll();
	}
	
	
	
	
}
