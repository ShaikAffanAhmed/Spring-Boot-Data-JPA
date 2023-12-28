package com.app.affan.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Employee;
import com.app.affan.repo.EmployeeRepository;

@Component
public class TestEmployeeASaveRunner implements CommandLineRunner {
     @Autowired
	 private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
	 repo.saveAll(
			 Arrays.asList(
					 new Employee(101, "AA", 200.0,"Dev"),
					 new Employee(102, "BA", 500.0,"Dev"),
					 new Employee(103, "AC", 200.0,"QA"),
					 new Employee(104, "DD", 400.0,"QA"),
					 new Employee(105, "EF", 600.0,"Dev")
				    )
			 );
       //repo.getAllEmpNames().forEach(System.out::println);
	   //repo.fetchAllEmps().forEach(System.out::println);
	     repo.fetchIdAndNames() //Returns object[]
	     .stream().map(obj -> obj[0] + " : "+ obj[1])
	     .forEach(System.out::println);
	     
	     
	     Optional<String> opt = repo.getEmpNameById(1011);
	     if(opt.isPresent())
	    	 System.out.println(opt.get());
	     else
	    	 System.out.println("No Data");
	     
	    Employee e = repo.fetchEmployeeById(104)
	     .orElseThrow(()-> new RuntimeException("Not Found"));
	     System.out.println(e);
	     //System.out.println(repo.getEmpNameById(101));
	 }

}
