package com.app.affan.runner;

import java.util.Arrays;
import java.util.Optional;

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
	   //repo.findByAuthor("KSAI")
//	 repo.findByauthorIs("Affan")
//       .forEach(System.out::println);
//	 repo.findByBooktype("Frontend")
//	     .forEach(System.out::println);
	 //repo.findByBookCostLessThan(600.0)
	// repo.findByAuthorNotNull()
	 // repo.findByAuthorIsNull()
	 //repo.findByAuthorLike("%S%")
//	 repo.findByAuthorLike("A%")
	// repo.findByAuthorStartingWith("A%")
//	 repo.findByAuthorLike("%S")
	 //repo.findByAuthorEndingWith("%S")
	 //repo.findByAuthorContaining(%N%)
//	 repo.findByAuthorLike("%N%")
	// repo.findByAuthorLike("___")
	 
//	 repo.findByBookIdLessThanEqualOrBookTypeLike(105,"Front")
//	 .forEach(System.out::println);
	 
	Optional<Book> opt = repo.findByBookIdIs(1088);
	if(opt.isPresent())
		System.out.println(opt.get());
	else
	 System.out.println("No Data Found");
	
	}
}
