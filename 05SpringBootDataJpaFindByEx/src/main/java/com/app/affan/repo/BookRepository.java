package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.affan.entity.Book;
import java.util.List;
import java.util.Optional;

   /***
    * Output findBy<Variable><condition>(DataType param);
    * VariableName can be follows same case or camelcase.
    */

public interface BookRepository extends JpaRepository<Book, Integer>{

	// Select * from Book where author=?
	 //List<Book> findByauthor(String author);
	   List<Book> findByAuthor(String author);
	   List<Book> findByauthorIs(String author);
	   List<Book> findByAuthorEquals(String author);
	   
	   //SQL: select * from Book where BookType=?
	   List<Book> findByBooktype(String booktype);
	   
	   //findBy --> SELECT + Where = !=, > < null, not null, and or...
	   //SQL: Select * from book where book_cost=?
	   //List<Book> findByBookCostLessThan(Double bookCost);
	   
	 //SQL: Select * from book where book_id!=?
	  // List<Book> findByBookIdNot(Integer bookId);
	   
	 //SQL: Select * from book where cost=?
	  // List<Book> findByBookCostEqual(Double bookCost);
	   
	 //SQL: Select * from book where book_cost >= ?
	  // List<Book> findByBookCostGreaterThan(Double bookCost);
	   
	 //SQL: Select * from book where author is null ?
        // List<Book> findByAuthorIsNull();
	//   List<Book> findByAuthorNotNull();
    //   List<Book> findByAuthorIsNotNull();
	   
	   //-------------Like Operator --------------
//	   //SQL : Select * from book where author like?
//	   List<Book>  findByAuthorLike(String Expression);
//	   
//	   //SQL: select * from book where author like 'input%'
//	   List<Book> findByAuthorStartingWith(String input);
//	   
//	 //SQL: select * from book where author like '%input'
//	   List<Book> findByAuthorEndingWith(String input);
//	   
//	 //SQL: select * from book where author like '%input%'
//	   List<Book> findByAuthorContaining(String input);
//	   
//	   //------------- AND/ OR ------------------------
//	   //SQL : select * from book where bookId <= ? 0r bookType like ?
//	   List<Book>findByBookIdLessThanEqualOrBookTypeLike(Integer bookId, String input);
	   
	   //----Single Row -----------------
	   Optional<Book> findByBookIdIs(Integer id);
}
