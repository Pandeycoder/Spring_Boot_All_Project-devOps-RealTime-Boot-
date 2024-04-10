package in.nareshit.raghu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.model.User;
import in.nareshit.raghu.model.UserDetailsImpl;
import in.nareshit.raghu.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;
	
	
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException
	{
		//loading model class user object
		User user = repository.findByUsername(username)
				.orElseThrow(()->new UsernameNotFoundException("User not exist" + username));
		//converting into Spring Security User object
		return UserDetailsImpl.build(user);
	}
}