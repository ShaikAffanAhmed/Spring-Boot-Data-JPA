package com.app.affan.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Course;
import com.app.affan.entity.Student;
import com.app.affan.repo.CourseRepository;
import com.app.affan.repo.StudentRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner {

	@Autowired
	private CourseRepository crepo;
	
	@Autowired
	private StudentRepository srepo;

	public void run(String... args) throws Exception {
		
		Course c1 = new Course(50, "REACT", 5000.0);
		Course c2 = new Course(51, "ANGULAR", 4000.0);

		crepo.save(c1);
		crepo.save(c2);
		
		Student s1 = new Student(10, "AFFAN","Agmail.com",Arrays.asList(c1,c2));
		Student s2 = new Student(11, "SHAIK","Sgmail.com",Arrays.asList(c1,c2));
		
		srepo.save(s1);
		srepo.save(s2);
		
		
	}

}
