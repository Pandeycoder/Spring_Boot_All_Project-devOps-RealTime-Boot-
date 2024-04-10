package in.nareshit.raghu.payload;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignupRequest {
	
	@NotBlank
	@Size(min=3, max = 20)
	private String username;
	
	@NotBlank
	@Size(max = 50)
	@Email
	private String email;
	
	@NotBlank
	@Size(min=4, max = 20)
	private String password;
	
	private Set<String> role;
	
}
