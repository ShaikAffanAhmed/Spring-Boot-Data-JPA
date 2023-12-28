package com.app.affan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Student;
import com.app.affan.repo.StudentRepository;

@Component
public class TestOprRunner implements CommandLineRunner{

	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		
		Student sob = new Student();
		sob.setStdId(07);
		sob.setStdName("WICK");
		sob.setStdFee(20000.0);
		
		repo.save(sob); //INSERT OR UPDATE
	}

}
