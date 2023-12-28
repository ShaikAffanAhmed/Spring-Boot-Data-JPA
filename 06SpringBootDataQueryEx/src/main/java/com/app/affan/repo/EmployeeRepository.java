package com.app.affan.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.affan.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   
	//@Query("______")
	//ReturnType abstractMethodName(<Param>)
	
	/**
	 * This abstractMethodName can be any name...
	 * 
	 */
	
	//SQL: 1.fetch one column data
	  @Query("SELECT e.empName FROM Employee e")
	  //@Query("SELECT empName FROM Employee")
	  List<String> getAllEmpNames();
	  
	  //SQl: 2.select all columns
	  //@Query ("SELECT e FROM Employee e")
	    @Query ("FROM Employee e")
	     List<Employee> fetchAllEmps();
	  
	    //SQl: 3. select multiple columns
	    @Query("SELECT e.empId,e.empName FROM Employee e")
	    List<Object[]> fetchIdAndNames();
	    
	    //SQl: 4. SELECT one column and one row data
	    @Query("SELECT e.empName FROM Employee e WHERE e.empId=:id")  //colon indicates run time input
	    Optional<String> getEmpNameById(Integer id);

	    //SQL: 5 fetch all columns and one row
	    @Query("SELECT e FROM Employee e WHERE e.empId=:id")
	    Optional<Employee> fetchEmployeeById(Integer id);
}
