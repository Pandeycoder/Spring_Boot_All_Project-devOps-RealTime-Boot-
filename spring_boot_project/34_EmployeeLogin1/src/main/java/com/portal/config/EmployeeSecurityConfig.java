package com.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class EmployeeSecurityConfig {

	
	
	@Bean       //Authorization
	public SecurityFilterChain securityConfig(HttpSecurity http)throws Exception
	{
		
		http.authorizeHttpRequests((req)->
		req
		.requestMatchers("/superAdmin/**").hasRole("SUPERADMIN")
		.requestMatchers("/hr/**").hasAnyRole("SUPERADMIN","HR")
		.requestMatchers("/manager/**").hasAnyRole("SUPERADMIN","MANAGER")
		.requestMatchers("/employee/**").hasAnyRole("SUPERADMIN","MANAGER","HR","EMPLOYEE")
		.requestMatchers("/**").permitAll()
		.anyRequest().authenticated()
		).formLogin().loginPage("/signin").loginProcessingUrl("/login").defaultSuccessUrl("/employee/").and().csrf().disable();
		
		return http.build();
	}
}
