package com.portal.service;

import java.util.List;

import com.portal.entity.User;


public interface UserService {

	

	// Insert Data

	public boolean saveUser(User user) ;
	

	// Retrieve Data;
	public List<User> getAllUsers();

	//email check
	public boolean checkEmail(String email);
}
