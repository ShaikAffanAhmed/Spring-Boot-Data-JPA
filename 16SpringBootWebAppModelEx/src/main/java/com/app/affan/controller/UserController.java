package com.app.affan.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.affan.bean.User;

@Controller
public class UserController {
//Path  /info , Method: GET
	@RequestMapping (value="/info", method = RequestMethod.GET)
	public String showUserPage(
			//Model model
			//ModelMap model
			Map<String,Object>model)
	{
		System.out.println(model.getClass().getName());
		
		//model.addAttribute("uname", "Shaik");
		//model.addAttribute("cname", "SBMS");
		
		 model.put("uname", "Ahmed");
		 model.put("cname", "React");
		 return"UserHome";		
	}
	
	//Sending one user object
	@GetMapping("/obj")
	public String showUserob(Model model)
	{
		User user = new User(10,"Shaik","TAG-SY");
		
		model.addAttribute("obj", user);
		
		List<User> list = Arrays.asList(
				new User(10,"AA","XYZ"),
				new User(11,"AB","XYZ"),
				new User(12,"AC","MNO"),
				new User(13,"AD","MNO")
				);
		model.addAttribute("listObj", list);		
		return "UserData";
	}	
}
