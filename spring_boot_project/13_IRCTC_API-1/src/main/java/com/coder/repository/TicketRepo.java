package com.coder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {

	
}
