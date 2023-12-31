package com.app.affan.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.entity.Department;
import com.app.affan.entity.Employee;
import com.app.affan.repo.DepartmentRepository;
import com.app.affan.repo.EmployeeRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner {
 
	@Autowired
	private DepartmentRepository drepo;
	
	@Autowired
	private EmployeeRepository erepo;
	
	public void run(String... args) throws Exception {
		
            Department d1 = new Department(1054,"DEV","Ajay");
            Department d2 = new Department(1055,"QA","SAM");
            Department d3 = new Department(1056,"BA","KUMAR");
            drepo.save(d1);
            drepo.save(d2);
            drepo.save(d3);
            
            
            Employee e1 = new  Employee(10, "SAM", 500.0, d1);
            Employee e2 = new  Employee(11, "RAM", 600.0, d1);
            Employee e3 = new  Employee(12, "SYED", 700.0, d1);
            Employee e4 = new  Employee(13, "Ajay", 700.0, null);   
            erepo.save(e1);
            erepo.save(e2);
            erepo.save(e3);
            erepo.save(e4);
            
            List<Object[]> list1 = erepo.getEnameDeptNames();
            for(Object[] ob:list1)
            {
            	System.out.println(ob[0]+" --Is working on Dept --"+ob[1]);
            }
            
            List<Object[]> list2 = erepo.getAllEnamesAndDeptNamesIfExist();
            for(Object[] ob:list2)
            {
            	System.out.println(ob[0]+" --##################### --"+ob[1]);
            }
            
            List<Object[]> list3 = erepo.getAllDeptsAndEnamesIfExist();
            for(Object[] ob:list3)
            {
            	System.out.println(ob[0]+" --******************** --"+ob[1]);
            }
            
          //  List<Object[]> list4 = erepo.getAllData();
            List<Object[]> list4 = erepo.getEnameDeptNames("DEV");
            for(Object[] ob:list4)
            {
            	System.out.println(ob[0]+" --$$$$$$$$$$$$$$$ --"+ob[1]);
            }
	}
	

}
