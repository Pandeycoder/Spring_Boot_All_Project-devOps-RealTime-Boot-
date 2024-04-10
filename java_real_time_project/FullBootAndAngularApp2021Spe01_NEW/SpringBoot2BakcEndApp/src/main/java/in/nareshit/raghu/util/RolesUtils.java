package in.nareshit.raghu.util;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.constant.ERole;
import in.nareshit.raghu.model.Role;
import in.nareshit.raghu.repo.RoleRepository;

@Component
public class RolesUtils {

	@Autowired
	private RoleRepository repo;

	public void mapRoles(Set<String> userRoles, Set<Role> dbRoles) {
		
		if(userRoles == null || userRoles.isEmpty()) {
			Role userRole = repo.findByName(ERole.ROLE_USER).orElseThrow(()->new RuntimeException("Error: Role Not Found"));
			dbRoles.add(userRole);
		} else {
			userRoles.forEach(role -> {
				switch(role) {
				case "admin": 
					Role adminRole = repo.findByName(ERole.ROLE_ADMIN).orElseThrow(()->new RuntimeException("Error: Role Not Found"));
					dbRoles.add(adminRole);
					break;
				case "mod": 
					Role modRole = repo.findByName(ERole.ROLE_MODERATOR).orElseThrow(()->new RuntimeException("Error: Role Not Found"));
					dbRoles.add(modRole);
					break;
				default:
					Role userRole = repo.findByName(ERole.ROLE_USER).orElseThrow(()->new RuntimeException("Error: Role Not Found"));
					dbRoles.add(userRole);
					break;
				}
			});
		}
	}
}
