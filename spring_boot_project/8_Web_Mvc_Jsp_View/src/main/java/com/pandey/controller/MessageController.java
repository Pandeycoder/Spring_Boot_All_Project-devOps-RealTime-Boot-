package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@GetMapping("/welcome")
	public String getWel(Model model)
	{
		
		model.addAttribute("msg","Welcome to our Page");
		
		return "index";
	}
	

	@GetMapping("/greet")
	public String getGret(Model model)
	{
		
		model.addAttribute("msg","Good Night....");
		
		return "index";
	}
	

}
