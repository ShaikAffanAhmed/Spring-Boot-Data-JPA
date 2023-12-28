package com.app.affan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Component;

import com.app.affan.entity.Employee;
import com.app.affan.repo.EmployeeRepository;

//@Component

public class TestBDataFetchRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
	   Iterable<Employee> list = repo.findAll();
	   list.forEach(System.out::println);
	  
	   //--case-1 --1 column -- Asc order -------------
	  // Iterable<Employee> list2 = repo.findAll(Sort.by("empSal")); // order by esal asc
	   Iterable<Employee>list2 = repo.findAll(Sort.by("empSal").ascending());  // order by esal asc
	 list2.forEach(System.out::println);
	 
	 //--case-2 --2 column -- Asc order -------------
	   Iterable<Employee>list3 = repo.findAll(Sort.by("empSal").descending());  // order by esal desc
	 list3.forEach(System.out::println);
	 
	 //--case-3 --3 column -- Asc order -------------
	   Iterable<Employee>list4 = repo.findAll(
			 //Sort.by("empSal","empDept"));  // order by esal asc,edept asc
			   Sort.by("empSal","empDept").descending());   // order by esal desc,edept desc
	   list4.forEach(System.out::println);
	   
	   //----case4 --- n columns  ----- Mixed order --------
	   repo.findAll(
			   Sort.by(org.springframework.data.domain.Sort.Order.asc("empSal"),org.springframework.data.domain.Sort.Order.desc("empDept")))
	   .forEach(System.out::println);
	}

}
