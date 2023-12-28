package com.app.affan.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Student;
import com.app.affan.repo.StudentRepository;

@Component
public class StudentTestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String s =sdf.format(new Date());
		System.out.println(s);
		
         Student s1 = new Student();
         s1.setStdName("SAM");
         s1.setStdfee(400.00);
         s1.setStdDoj(new Date());
         repo.save(s1);
         
         List<Student> list = repo.findAll();
         System.out.println(list.getClass().getName());
         list.forEach(System.out::println);
         
         Student sob = new Student();
         sob.setStdfee(400.0);
         sob.setStdfee(400.0);
         Example<Student> prob = Example.of(sob);
         repo.findAll(prob).forEach(System.out::println);       
	}

}
