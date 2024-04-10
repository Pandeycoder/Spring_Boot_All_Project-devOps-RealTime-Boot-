package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CourseController {

	
	public CourseController()
	{
		System.out.println("controller couser start...");
	}
	
	
	@GetMapping("/course/{cname}/info")
	public String getCourseInfo(@PathVariable("cname") String cname, Model model)
	{
		
		String msgText=cname+" New Batch Start Next Week...!";
		
		model.addAttribute("msg",msgText);
		
		
		return "index";
	}
	
}
