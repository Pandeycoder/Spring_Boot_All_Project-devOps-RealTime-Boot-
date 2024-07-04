package com.bank.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entitry.Customer;
import com.bank.entitry.Student;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BankService {
	
	@PostMapping("/userinfo")
	public int chekBalance(@RequestBody Customer c)
	{
		System.out.println();
		return 0;
	}
	
	@PostMapping(value="/saveStudent",consumes = {"application/xml","application/json"}, produces = {"application/json","application/xml"})
	String saveStudent(@RequestBody Student s) {

		if(s.equals(null))
		{
			System.out.println("receive null object of student");
			return "Error";
		}
		System.out.println(s.getAddress());
		System.out.println(s.getContactNo());
		System.out.println(s.getEmail());
		System.out.println(s.getEmail());
		System.out.println(s.getGender());
		return "ok";
	}
}
