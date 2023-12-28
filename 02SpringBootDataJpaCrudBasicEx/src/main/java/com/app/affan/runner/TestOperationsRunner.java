package com.app.affan.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Product;
import com.app.affan.excetion.productNotFoundException;
import com.app.affan.repo.ProductRepository;

@Component
public class TestOperationsRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	public void run(String... args) throws Exception {
		//System.out.println(repo.getClass().getName());
		
		Product p1 = new Product(10,"P1",100.0);
		Product p2 = new Product(20,"P2",200.0);
		Product p3 = new Product(30,"P3",300.0);
		
		
		/* repo.save(p1); repo.save(p2); repo.save(p3); */
		 
		repo.saveAll(Arrays.asList(p1,p2,p3)); 
		
		Iterable<Product> data =  repo.findAll();
		//JDK 1.5 forEach Loop
		for(Product pob:data) {
		   System.out.println(pob);
	}
           System.out.println("------------------");
           //JDK 1.8 Default method + Lambda Expression
           data.forEach(ob-> System.out.println(ob));
           
           System.out.println("******************");
           //JDK 1.8 Default method + method References
           data.forEach(System.out::println );
           
           System.out.println(repo.existsById(555));//true
           System.out.println(repo.existsById(855));//false
           
           System.out.println(repo.count());//long -- no.of rows
           
           //-----------------------------------------------//
           //fetch one row based on id
           Optional<Product> opt= repo.findById(20);
           if(opt.isPresent())
           {
        	   Product p = opt.get();
        	   System.out.println(p);
           }
           else {
        	   System.out.println("DATA NOT FOUND");
           }
           
           Product p = repo.findById(20).orElseThrow(() -> new productNotFoundException("NOT EXIST"));
           System.out.println(p);
           
           //-----------------------------------------//
	       Iterable<Product> list = repo.findAllById(Arrays.asList(11,22,45,56,85,65));
	       list.forEach(System.out::println);
	       
	       //-----------------------------------------------//
	       //repo.deleteById(55);
	       //repo.deleteById(99);
	       
	       //JPA Concept 
			
			 /* repo.delete( repo.findById(90).orElseThrow(() -> new productNotFoundException(
			                      String.format(" -- %s Not Having %d -- ",Product.class.getName(),90) ) ) );*/
			 
	       //--------------------------------------------------//
	       
	       repo.deleteAllById(Arrays.asList(11,22,45,56));
	      // repo.deleteAll();
	}
}
