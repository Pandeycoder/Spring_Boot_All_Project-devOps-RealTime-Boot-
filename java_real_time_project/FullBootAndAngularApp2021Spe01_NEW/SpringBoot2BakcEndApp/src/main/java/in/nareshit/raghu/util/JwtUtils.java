package in.nareshit.raghu.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.UserDetailsImpl;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {

	@Value("${my.app.secret}")
	private String secret;

	@Value("${my.app.expTime}")
	private long expTime;

	public String generateToken(Authentication authentication) {
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

		return Jwts.builder()
				.setSubject(userDetails.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + expTime))
				.signWith(SignatureAlgorithm.HS512, secret)
				.compact();
	}	
	public String getUsernameFromJwtToken(String token) {
		return Jwts.parser()
				.setSigningKey(secret)
				.parseClaimsJws(token)
				.getBody()
				.getSubject();

	}
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
