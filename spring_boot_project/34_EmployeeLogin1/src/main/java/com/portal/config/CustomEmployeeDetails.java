package com.portal.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.portal.entity.User;

public class CustomEmployeeDetails implements UserDetails {

	private User user;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		
		SimpleGrantedAuthority simpleGrantedtAuthority=new SimpleGrantedAuthority(user.getRole());
		return Arrays.asList(simpleGrantedtAuthority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		
		
		return user.getEmail();
	}
	
	@Override
	public boolean isAccountNonLocked()
	{
		return true;
	}
	
	@Override
	public boolean isEnabled()
	{
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired()
	{
		return true;
	}
	
	
	
	
}
