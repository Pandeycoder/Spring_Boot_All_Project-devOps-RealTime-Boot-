package com.coder.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coder.request.Passanger;
import com.coder.response.Ticket;

@Service
public class MakeMyTripImpl implements MakeMyTripService {

	@Override
	public Ticket bookTicket(Passanger passanger) {

		String apiUrl = "http://localhost:8089/book-ticket";

		// sending post request , requBodyData ,responseBodyType
		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket> responseEntity = rt.postForEntity(apiUrl, passanger, Ticket.class);

		Ticket responseBody = responseEntity.getBody();

		return responseBody;
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub

		String apiUrl = "http://localhost:8089/show-tickets";

		// sending post request , requBodyData ,responseBodyType
		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);

		Ticket[] body = forEntity.getBody();

		List<Ticket> tickets = Arrays.asList(body);

		return tickets;
	}

	@Override
	public Ticket findTicket(Integer ticketNum) {

		String apiUrl = "http://localhost:8089/search-ticket/{ticketNum}";

		// sending post request , requBodyData ,responseBodyType
		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket> forEntity = rt.getForEntity(apiUrl, Ticket.class, ticketNum);

		Ticket body = forEntity.getBody();

		// TODO Auto-generated method stub
		return body;
	}

}
