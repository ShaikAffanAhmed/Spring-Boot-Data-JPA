package com.app.affan.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.affan.entity.Employee;
import com.app.affan.exception.EmployeeNotFoundException;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	void updateEmployee(Employee e);
	void deleteEmployee(Integer id) throws EmployeeNotFoundException;
	Employee getOneEmployee(Integer id) throws EmployeeNotFoundException;
	List<Employee> getAllEmployees();
	Page<Employee> getAllEmployees(Pageable pageable);
}
