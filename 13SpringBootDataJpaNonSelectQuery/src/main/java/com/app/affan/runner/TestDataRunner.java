package com.app.affan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Product;
import com.app.affan.repo.ProductRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
	
		repo.save(new Product(101,"AA", 200.0));
		System.out.println("___________________");
		
		int count = repo.updateNameById("PEN", 101);
		System.out.println(count);
		
		int count1 = repo.removeById(101);
		System.out.println(count1);

	}

}
