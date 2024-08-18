package com.portal.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

	@Autowired
	private DataSource dataSource;
	
	@Autowired   //Authentication  JDBC
	public void  authManager(AuthenticationManagerBuilder auth)throws Exception
	{
		auth
		.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("select username,password,enabled from users where username=?")
		.authoritiesByUsernameQuery("select username,authority from authorities where username=?");	
	}
	
	@Bean       //Authorization
	public SecurityFilterChain securityConfig(HttpSecurity http)throws Exception
	{
		
		http.authorizeHttpRequests((req)->
		req
		.requestMatchers("/superAdmin").hasRole("SUPERADMIN")
		.requestMatchers("/hr").hasAnyRole("SUPERADMIN","HR")
		.requestMatchers("/manager").hasAnyRole("SUPERADMIN","MANAGER")
		.requestMatchers("/user").hasAnyRole("SUPERADMIN","MANAGER","HR","USER")
		.requestMatchers("/").permitAll()
		.anyRequest().authenticated()
		).formLogin();
		
		return http.build();
	}
}
