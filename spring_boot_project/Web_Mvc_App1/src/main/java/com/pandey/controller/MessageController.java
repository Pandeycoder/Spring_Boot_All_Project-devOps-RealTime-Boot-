package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	public MessageController(){
		System.out.println("message controller start");
		
	}

	@GetMapping("/welcome")
	public ModelAndView getWelcome()
	{
		ModelAndView mav=new ModelAndView();
		
		//setting data in key value format to accesss in view page
		mav.addObject("msg","pandey coder sorry.........");
		
		//return view file name
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/Greet")
	public ModelAndView getGreet()
	{
		ModelAndView mav=new ModelAndView();
		
		//setting data in key value format to accesss in view page
		mav.addObject("greet","most welcome.........");
		
		//return view file name
		mav.setViewName("index");
		
		return mav;
	}
}
