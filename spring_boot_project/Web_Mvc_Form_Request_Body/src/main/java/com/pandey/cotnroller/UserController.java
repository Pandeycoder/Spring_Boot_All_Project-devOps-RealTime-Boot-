package com.pandey.cotnroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pandey.binding.User;
import com.pandey.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	public UserController()	{System.out.println("User controller start....");}
	
	
	/*
	 * To load empty form
	 *  @param model
	 * return String
	 */
	
	
	@GetMapping("/")
	public String loadForm(Model model)
	{
//		User userobj=new User();
		
		model.addAttribute("user", new User());
		
		return "index";
	}
	
	

	/*
	 * To handle form submission
	 * @Param model
	 * return 
	 */
	
	@PostMapping("/user")
	public String handleSubmitBtn(User user, Model model)
	{
		
		//ToDo : store form data into database
		boolean saveUser=userService.saveUser(user);
		
		if(saveUser)
		{
			model.addAttribute("msg","User Data saved successfully..!");
		}
		
		
		
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getPhno());
		
		
		
		return "index";
	}
	

}
