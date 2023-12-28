package com.app.affan.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Model;
import com.app.affan.entity.Product;
import com.app.affan.repo.ModelRepository;
import com.app.affan.repo.ProductRepository;


@Component
public class TestDataInsertRunner implements CommandLineRunner {

	@Autowired
	private ModelRepository repo;
	
	@Autowired
	private ProductRepository prepo;
	
	
	public void run(String... args) throws Exception {
		
		Model m1 = new Model(1000,"XYZ-A","4GB-32GB-Red");
		Model m2 = new Model(1001,"XYZ-B","6GB-64GB-Green");
		Model m3 = new Model(1002,"MN-C","8GB-128GB-Blue");
		Model m4 = new Model(1003,"MN-D","12GB-256GB-Black");
		
		Product p1 = new Product(10,"ABCD-XYZ", Arrays.asList(m1,m2));
		Product p2 = new Product(11,"ABCD-MN", Arrays.asList(m3,m4));
		
		/*repo.save(m1);
		repo.save(m2);
		repo.save(m3);
		repo.save(m4);*/
		
		prepo.save(p1);
		prepo.save(p2);
		
		System.out.println("**************************");
		prepo.findAll();
		System.out.println("**************************");

	}

}
