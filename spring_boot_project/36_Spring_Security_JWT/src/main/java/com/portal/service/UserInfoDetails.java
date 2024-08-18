package com.portal.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.portal.entity.UserInfo;

public class UserInfoDetails implements UserDetails {

	String userName=null;
	
	public UserInfoDetails(UserInfo userInfo)
	{
		userName=userInfo.getNa
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}
