package in.nareshit.raghu.payload;

import java.util.Set;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class JwtResponse {

	@NotNull
	@NonNull
	private String token;
	
	private String type = "Bearer";
	
	@NotNull
	@NonNull
	private Long id;
	
	@NotNull
	@NonNull
	private String username;
	
	@NotNull
	@NonNull
	private String email;

	@NotNull
	@NonNull
	private Set<String> roles;
}
