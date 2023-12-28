package com.app.affan.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Book;
import com.app.affan.repo.BookRepository;

@Component
public class TestDataRunner implements CommandLineRunner{

	 @Autowired
     private BookRepository repo;
	 
	public void run(String... args) throws Exception {
	 repo.saveAll(
			 Arrays.asList(
					 new Book(101,"SBMS","AFFAN",300.0,"Backend"),
					 new Book(102,"CORE","AFFAN",200.0,"Backend"),
					 new Book(103,"ADV","KSAI",400.0,"Backend"),
					 new Book(104,"REACT",null,500.0,"Frontend"),
					 new Book(105,"HTML","AFFAN",600.0,"Frontend"),
					 new Book(106,"CSS",null,300.0,"Frontend"),
					 new Book(107,"ANGULAR","MUSA",800.0,"Frontend"),
					 new Book(108,"SQL","AFFAN",600.0,"DataBase")
					 
              		 )
			 );
	 
	       //repo.getBooksByAuthor("MUSA")
             repo.getBooksAuthorCost("N%", 300.0)
          // repo.getBooksId(Arrays.asList(101,102,103,104,105))
	         .forEach(System.out::println);
	}
}
