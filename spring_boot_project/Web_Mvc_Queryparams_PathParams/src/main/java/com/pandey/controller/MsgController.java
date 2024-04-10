package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MsgController {
	
	
	public MsgController()
	{
		System.out.println("start msg controller....");
	}
	
	@GetMapping("/greet")
	public String greetMsg(@RequestParam("name") String name ,Model model)
	{
		
		String msgText="good morning, "+name;
		
		model.addAttribute("msg",msgText);
		
		return "index";
		
	}

}
