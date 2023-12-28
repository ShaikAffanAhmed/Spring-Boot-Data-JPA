package com.app.affan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Role;
import com.app.affan.entity.User;
import com.app.affan.repo.RoleRepository;
import com.app.affan.repo.UserRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner {

	@Autowired
	private RoleRepository rrepo;
	
	@Autowired
	private UserRepository urepo;
	
	public void run(String... args) throws Exception {
	
		Role r1 = new Role(10, "ADMIN");
		Role r2 = new Role(11, "GUEST");
		
		rrepo.save(r1);
		rrepo.save(r2);
		
		User u1 = new User(50, "JIMMY", r1);
		User u2 = new User(55, "SAM", r2);
		
		urepo.save(u1);
		urepo.save(u2);
	}

}
