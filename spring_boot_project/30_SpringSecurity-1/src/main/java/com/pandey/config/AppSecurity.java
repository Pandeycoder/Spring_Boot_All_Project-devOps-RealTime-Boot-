package com.pandey.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurity  {

	@Bean
	 SecurityFilterChain securityFilter(HttpSecurity http) throws Exception
	{
		
		http.authorizeRequests((req)->
	      req.requestMatchers("/welcome","login","/swagger-ui.html")
		  .permitAll()
		  .anyRequest()
		  .authenticated())
		  .formLogin();
		
		
		return http.build();     
	}
	
	/*@Bean
	public InMemoryUserDetailsManager inMemUsers()
	{
		UserDetails u1=User..withDefaultPasswordEncoder()
				.username("pandey")
				.password("coder")
				.roles("Admin")
				.build();
		
		UserDetails u2=User.withDefaultPasswordEncoder()
				.username("rupesh")
				.password("rupesh")
				.roles("Admin")
				.build();
		
		
		return new InMemoryUserDetailsManager(u1,u2);
		
	}*/
	
	
}
