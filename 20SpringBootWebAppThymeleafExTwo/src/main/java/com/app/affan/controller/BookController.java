package com.app.affan.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.affan.bean.Book;

@Controller
@RequestMapping("/book")
public class BookController {

	@GetMapping("/show")
	//1. Display book object 
	public String showData(Model model)
	{
		Book b1 = new Book(101, "Core Java", "John Wick", 500.00);
		model.addAttribute("bookobj", b1);
		return "BookData";
	}
	
	@GetMapping("/list")
	//2. Display book collection at UI
	public String showColl(Model model)
	{
		List<Book> list = Arrays.asList(
	             new Book(10,"ADVANCE JAVA","SAM",200.0),
	             new Book(11,"REACT","JOHN",300.0),
	             new Book(12,"ANGULAR","LUCIFER",400.0),
	             new Book(13,"DEVOPS","THOR",500.0)
				);
		model.addAttribute("list", list);		
		return "BookList";
	}
	
}
