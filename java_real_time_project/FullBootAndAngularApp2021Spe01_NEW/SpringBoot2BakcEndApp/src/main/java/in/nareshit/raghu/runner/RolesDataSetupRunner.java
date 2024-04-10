package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.constant.ERole;
import in.nareshit.raghu.model.Role;
import in.nareshit.raghu.repo.RoleRepository;

@Component
public class RolesDataSetupRunner implements CommandLineRunner {

	@Autowired
	private RoleRepository repo;
	
	public void run(String... args) throws Exception {
		ERole[] roles = ERole.values();
		
		for(ERole role : roles) {
			if(!repo.findByName(role).isPresent()) {
				Role rob = new Role();
				rob.setName(role);
				repo.save(rob);
			}
		}
	}

}
