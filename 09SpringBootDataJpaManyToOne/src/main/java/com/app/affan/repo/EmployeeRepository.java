package com.app.affan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.affan.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("select emp.empName,dept.deptName from Employee emp INNER JOIN emp.dob as dept")
	List<Object[]> getEnameDeptNames();
	
	//@Query("select emp.empName,dept.deptName from Employee emp LEFT OUTER JOIN emp.dob as dept")
	@Query("select emp.empName,dept.deptName from Employee emp LEFT OUTER JOIN emp.dob as dept where dept IS NULL")
	List<Object[]> getAllEnamesAndDeptNamesIfExist();
	
	//@Query("select emp.empName,dept.deptName from Employee emp RIGHT OUTER JOIN emp.dob as dept")
	@Query("select emp.empName,dept.deptName from Employee emp RIGHT OUTER JOIN emp.dob as dept WHERE emp IS NULL")
	List<Object[]> getAllDeptsAndEnamesIfExist();

	@Query("select emp.empName,dept.deptName from Employee emp FULL JOIN emp.dob as dept ")
	List<Object[]> getAllData();
	
	@Query("select emp.empName,dept.deptName from Employee emp INNER JOIN emp.dob as dept where dept.deptName=:deptName")
	List<Object[]> getEnameDeptNames(String deptName);
}
