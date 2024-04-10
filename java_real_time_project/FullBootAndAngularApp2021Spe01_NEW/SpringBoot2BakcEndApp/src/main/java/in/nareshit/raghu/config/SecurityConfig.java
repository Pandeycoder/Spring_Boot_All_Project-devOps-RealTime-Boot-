package in.nareshit.raghu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.google.common.collect.ImmutableList;

import in.nareshit.raghu.filter.SecurityFilter;
import in.nareshit.raghu.security.AuthenticationEntryPointJwt;
import in.nareshit.raghu.service.impl.UserDetailsServiceImpl;

@Configurable
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Autowired
	private AuthenticationEntryPointJwt authenticationEntryPoint;
	
	@Bean
	public SecurityFilter securityFilter() {
		return new SecurityFilter();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder());
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable()
		.authorizeRequests()
		.antMatchers("/auth/**").permitAll()
		.anyRequest().authenticated()
		
		.and()
		.exceptionHandling()
		.authenticationEntryPoint(authenticationEntryPoint)
		
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		http.addFilterBefore(securityFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		 final CorsConfiguration configuration = new CorsConfiguration();
		    configuration.setAllowedOrigins(ImmutableList.of("http://localhost:4200"));
		    configuration.setAllowedMethods(ImmutableList.of("HEAD",
		            "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
		    configuration.setAllowCredentials(true);
		    configuration.setAllowedHeaders(ImmutableList.of("*"));
		    configuration.setExposedHeaders(ImmutableList.of(
		    		"X-Auth-Token","Authorization","Access-Control-Allow-Origin",
		    		"Access-Control-Allow-Credentials"));
		    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		    source.registerCorsConfiguration("/**", configuration);
		    return source;
	}
	
}
