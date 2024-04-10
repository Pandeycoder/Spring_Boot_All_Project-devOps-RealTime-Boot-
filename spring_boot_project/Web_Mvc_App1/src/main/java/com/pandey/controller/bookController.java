package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class bookController {

	
	public bookController() {
		System.out.println("BookController:: Constructor ");
	}
	
	
	@GetMapping("/book")
	public ModelAndView getBookData()
	{
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("id",101);
		mav.addObject("name","java");
		mav.addObject("price","1000");
		
		
		mav.setViewName("book");
		
		return mav;
		
	}
}
