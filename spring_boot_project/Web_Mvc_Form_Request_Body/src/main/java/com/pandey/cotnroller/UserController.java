package com.pandey.cotnroller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.pandey.binding.User;
import com.pandey.service.UserService;

import jakarta.validation.Valid;

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
	public String handleSubmitBtn(@Valid User user, BindingResult result, Model model)
	{
		
		System.out.println(user);
		
		if(result.hasErrors())
		{
			return "index";
		}
		
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
	
	@GetMapping("/users")
	public String viewUsers(Model model)
	{
		
		List<User> allUsers=userService.getAllUsers();
		
		model.addAttribute("users",allUsers);
		
		
		return "view-users";
	}
	
	
	@PutMapping("/userUpdate")
	public String userUpdate(Model model)
	{
		
		List<User> allUsers=userService.getAllUsers();
		
		model.addAttribute("users",allUsers);
		
		
		return "edit-User";
	}
	
	@DeleteMapping("/userDelete")
	public String userDelete(User user,Model model)
	{
		Optional<User> findById;
	    
		//model.addAttribute("users",allUsers);
		
		
		return "view-users";
	}
	
	
	
	

}
