package com.pandey.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pandey.binding.User;
//it is handle to the req and res 
@Controller  
public class UserController {
	
	
	@GetMapping("/users")
	public String getUsers(Model model)
	{
		
		User user1=new User(101,"coder","coder@gmail.com");
		
		User user2=new User(102,"pandey","pandey@gmail.com");
		
		User user3=new User(103,"mahadev","mahadev@gmail.com");
		
		
		List<User> usersList=Arrays.asList(user1,user2,user3);
		
		model.addAttribute("usersData",usersList);
		
		
		return "view-users";
	}
	
	
	
	
	@GetMapping("/user")
	public String getUserData(Model model)
	{
		User userObj=new User(101,"coder","pandey@gmail.com");
		
		model.addAttribute("user",userObj);
		
		return "user-data";
		
	}
	
	
	
	@GetMapping("/email")
	public String getUserEmail(Model model) {
		
		model.addAttribute("data","pandeycoder@gmail.com");
		
		return "index";
	}
	
	
	
	
	@GetMapping("/name")
	public ModelAndView getUser()
	{
		
		ModelAndView mav=new ModelAndView();
		
		
		//set data to model
		
		mav.addObject("name","Pandey");
		
		
		
		//set view name or file name UI
		mav.setViewName("index");
		
		return mav;
		
	}

}
