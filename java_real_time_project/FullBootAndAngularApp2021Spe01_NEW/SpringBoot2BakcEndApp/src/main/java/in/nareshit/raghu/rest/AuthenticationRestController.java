package in.nareshit.raghu.rest;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.Role;
import in.nareshit.raghu.model.User;
import in.nareshit.raghu.model.UserDetailsImpl;
import in.nareshit.raghu.payload.JwtResponse;
import in.nareshit.raghu.payload.LoginRequest;
import in.nareshit.raghu.payload.MessageResponse;
import in.nareshit.raghu.payload.SignupRequest;
import in.nareshit.raghu.repo.UserRepository;
import in.nareshit.raghu.util.JwtUtils;
import in.nareshit.raghu.util.RolesUtils;

@RestController
@RequestMapping("/auth")
public class AuthenticationRestController {

	@Autowired
	private JwtUtils jwtUtils;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RolesUtils rolesUtils;
	@Autowired
	private PasswordEncoder encoder;
	//login
	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(
			@Valid @RequestBody LoginRequest loginRequest
			)
	{
		// check for Authentication
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						loginRequest.getUsername(),
						loginRequest.getPassword())
				);
		
		// set as SecurityContext(Authentication)
		SecurityContextHolder.getContext().setAuthentication(authentication);

		// Generate JWT Token
		String jwt = jwtUtils.generateToken(authentication);
		
		//current user object
		UserDetailsImpl userDetails= (UserDetailsImpl)authentication.getPrincipal();
		
		// return response
		return ResponseEntity.ok(
				new JwtResponse(
						jwt, //token
						userDetails.getId(),
						userDetails.getUsername(), //username
						userDetails.getEmail(), //email
						userDetails.getAuthorities()
						.stream()
						.map(auth->auth.getAuthority())
						.collect(Collectors.toSet()) //Set<String>
						)
				);
	}

	@PostMapping("/register")
	public ResponseEntity<?> createUser(
			@Valid @RequestBody SignupRequest signupRequest
			)
	{
		if(userRepository.existsByUsername(signupRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error : Username already exist"));
		}
		//check email exist
		if(userRepository.existsByEmail(signupRequest.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error : EmailId already exist"));
		}
		
		User user = new User(
				signupRequest.getUsername(),
				signupRequest.getEmail(),
				encoder.encode(signupRequest.getPassword())
				);
		
		Set<String> usrRoles = signupRequest.getRole();
		
		
		Set<Role> dbRoles = new HashSet<>();
		rolesUtils.mapRoles(usrRoles, dbRoles);
		user.setRoles(dbRoles);
		
		userRepository.save(user);
		return ResponseEntity.ok(new MessageResponse("User Created Successfully!"));
	}
}

