package com.app.affan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("prod")
public class ProductController {
		
	@GetMapping("/home")
	public String showEmp()
	{
		return "ProdData";
	}
		
	}

