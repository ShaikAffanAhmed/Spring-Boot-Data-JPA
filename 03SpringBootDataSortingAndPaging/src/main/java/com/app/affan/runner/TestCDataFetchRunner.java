package com.app.affan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.app.affan.repo.EmployeeRepository;

// @Component
public class TestCDataFetchRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;
    
	public void run(String... args) throws Exception {
		 //1.select * from employee order by eSal ASC
		repo.findAll(Sort.by("empSal"))
		.forEach(System.out::println);
		
		//2.select * from employee order by esal DESC
		repo.findAll(Sort.by("empSal").descending())
		.forEach(System.out::println);
		
		//3.select * from employee order by esal, edept; //both ASC
		//repo.findAll(Sort.by("empSal","empDept"))
		repo.findAll(Sort.by("empSal","empDept").descending())
		.forEach(System.out::println);
		
		//4.select * from employee order by esal ASC,edept DESC;
		repo.findAll(
				Sort.by(org.springframework.data.domain.Sort.Order.asc("empSal"),org.springframework.data.domain.Sort.Order.desc("empDept")))
		.forEach(System.out::println);
	}

}
