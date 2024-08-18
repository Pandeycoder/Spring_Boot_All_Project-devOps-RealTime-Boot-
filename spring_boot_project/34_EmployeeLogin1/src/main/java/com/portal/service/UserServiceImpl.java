
package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.User;
import com.portal.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService  {

	@Autowired
	private UserRepo userRepo;

	// Insert Data

	@Override
	public boolean saveUser(User user) {
		user = userRepo.save(user);
		return user.getUserId() > 0;
	}

	// Retrieve Data

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();

	}

	@Override
	public boolean checkEmail(String email) {
	
		return userRepo.existsByEmail(email);
	}

}
