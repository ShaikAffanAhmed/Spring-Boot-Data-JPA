package com.app.affan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.affan.entity.Book;

   /***
    * Output findBy<Variable><condition>(DataType param);
    * VariableName can be follows same case or camelcase.
    */

public interface BookRepository extends JpaRepository<Book, Integer>{

	//SQL : select * from booktab where author = ?
	//@Query("SELECT b from Book b where b.author =?1")
	@Query("SELECT b from Book b where b.author = :abc")
	List<Book>getBooksByAuthor(@Param("abc")String author);
	
	
	//SQL : select * from booktab where author like ? or bcost > ?
	@Query("SELECT a from Book a where a.author like ?1 OR a.bookCost > ?2 OR a.bookType=?3")
	//@Query("SELECT a from Book a where a.author like :author OR a.bookCost > :bookCost")
	List<Book>getBooksAuthorCost(String author, Double bookCost);
	
	//SQL : select * from booktab where bid in (?,?,?)
	//@Query("select a from Book a where a.bookId in (?1)")
	@Query("select a from Book a where a.bookId in(:inputs)")
	List<Book>getBooksId(List<Integer>inputs);
}
