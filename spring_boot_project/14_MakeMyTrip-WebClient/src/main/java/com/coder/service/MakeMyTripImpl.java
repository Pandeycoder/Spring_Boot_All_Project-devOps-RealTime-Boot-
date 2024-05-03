package com.coder.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.coder.request.Passanger;
import com.coder.response.Ticket;

import reactor.core.publisher.Mono;

@Service
public class MakeMyTripImpl implements MakeMyTripService {

	@Override
	public Mono<Ticket> bookTicket(Passanger passanger) {

		String apiUrl = "http://localhost:8082/ticket";

		
		WebClient webClient=WebClient.create();
		
		Mono<Ticket> body1 = webClient.post()
					.uri(apiUrl)
			        .body(BodyInserters.fromValue(passanger))
			        .retrieve()
			        .bodyToMono(Ticket.class);
		
			      
		return body1;
	}

	
	
	@Override
	public Mono<Ticket[]> getAllTicket() {
		// TODO Auto-generated method stub

		String apiUrl = "http://localhost:8082/tickets";

		
		

		WebClient webClient=WebClient.create();
		
		Mono<Ticket[]> bodyMono=webClient.get()
				              .uri(apiUrl)
				              .retrieve()
				              .bodyToMono(Ticket[].class);
		return bodyMono;
	}

	
	
	@Override
	public Mono<Ticket> findTicket(Integer ticketNum) {

		String apiUrl = "http://localhost:8082/ticket/{ticketNum}";

		WebClient webClient=WebClient.create();
		
		Mono<Ticket> bodyMono1=webClient.get()
				              .uri(apiUrl)
				              .retrieve()
				              .bodyToMono(Ticket.class);
		
		
		return bodyMono1;
	}

}
