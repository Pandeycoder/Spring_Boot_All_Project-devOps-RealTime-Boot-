package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeLoginController {

	@GetMapping("/")
	public String bookTicket(Model model) {

		return "login";
	}

}
