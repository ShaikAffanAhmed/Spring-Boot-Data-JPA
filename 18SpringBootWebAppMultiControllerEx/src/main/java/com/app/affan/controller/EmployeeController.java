package com.app.affan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
@GetMapping("/home")
public String showEmp()
{
	return "EmpHome";
}
	
}
