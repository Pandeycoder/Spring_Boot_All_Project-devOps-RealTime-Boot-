package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

	@GetMapping("/quote")
	public String getQuote(Model model)
	{
		System.out.println("exception handler started quote..");
		model.addAttribute("msg", "No shortcut available for success...!");
		String s=null;
		s.length();
		return "index";
	}
}
