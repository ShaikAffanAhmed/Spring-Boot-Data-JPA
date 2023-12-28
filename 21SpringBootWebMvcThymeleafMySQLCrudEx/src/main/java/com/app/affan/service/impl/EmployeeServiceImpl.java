package com.app.affan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.affan.entity.Employee;
import com.app.affan.exception.EmployeeNotFoundException;
import com.app.affan.repo.EmployeeRepository;
import com.app.affan.service.IEmployeeService;
import com.app.affan.util.EmployeeUtil;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
//	@Autowired
//	private EmployeeUtil util;
	
	public Integer saveEmployee(Employee e) {
		//util.CommonCal(e);
		EmployeeUtil.CommonCal(e);
		e = repo.save(e);	
		return e.getEmpId();
	}
 
	public void updateEmployee(Employee e) {
		//util.CommonCal(e);
		EmployeeUtil.CommonCal(e);
        repo.save(e);
	}

	public void deleteEmployee(Integer id)  throws EmployeeNotFoundException{
         //repo.deleteById(id);
		/*Optional <Employee> opt= repo.findById(id);
		if(opt.isPresent())
		{
			repo.delete(opt.get());
		}
		else
		{
			throw new EmployeeNotFoundException("EMPLOYEE '"+id+"'NOT FOUND");
		}*/
		//repo.delete(repo.findById(id).orElseThrow(()->new EmployeeNotFoundException("EMPLOYEE '"+id+"'NOT FOUND")));
		repo.delete(this.getOneEmployee(id));
	}

	public Employee getOneEmployee(Integer id) throws EmployeeNotFoundException {
//		Optional<Employee> opt = repo.findById(id);
//		return opt.get();
		return repo.findById(id).orElseThrow(()->new EmployeeNotFoundException("EMPLOYEE '"+id+"'NOT FOUND"));
	}

	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}
	
	public Page<Employee> getAllEmployees(Pageable pageable) {
		Page<Employee> pages = repo.findAll(pageable);
		return pages;
	}
	
	
}
