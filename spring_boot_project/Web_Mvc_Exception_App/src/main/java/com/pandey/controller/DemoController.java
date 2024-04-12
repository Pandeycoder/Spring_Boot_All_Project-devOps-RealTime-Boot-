package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	
	@GetMapping("/welcome")
	public String welcomeMsg(Model model)
	{
		model.addAttribute("msg", "Welcome to our page");
	
		
			
			int i=10/0;
	
		
		return "index";
	}
	
	@ResponseBody
	@GetMapping("/greet")
	public String greetMsg()
	{
		return "welcome to greet";
	}
	
	
}
