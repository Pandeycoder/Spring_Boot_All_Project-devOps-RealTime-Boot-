package com.coder.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder.dao.UserDao;
import com.coder.service.UserService;

@RestController
@CrossOrigin
public class UserController {


	
	@GetMapping("/user")
	public String saveUser( UserDao userDao)
	{
		return "welcome to our page......!";
		
	}
}
