package com.portal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.portal.entity.UserInfo;
import com.portal.repo.UserInfoRepo;

@Service
public class UserInfoService implements UserDetailsService  {

	
	@Autowired
	private UserInfoRepo userInfoRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<UserInfo> userInfo=userInfoRepo.findByName(username);
		
		return userInfo.map(UserInfoDetails::new);
	}

	
}
