package com.app.affan.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.app.affan.entity.Employee;
//After java 8 (Static methods and default methods)
@Component
//public class EmployeeUtil {
public interface EmployeeUtil{

	public static void CommonCal(Employee e)
	{
		double hra = e.getEmpSal()* (12.0/100);
		double ta  = e.getEmpSal()* (4.0/100);
		e.setEmpHra(hra);
		e.setEmpTa(ta);			
	}
	
	public static void createDeptList(Model model)
	{
		List<String> list = Arrays.asList("DEV","QA","BA","ADMIN","IT");
    	model.addAttribute("deptlist", list);
	}
}
