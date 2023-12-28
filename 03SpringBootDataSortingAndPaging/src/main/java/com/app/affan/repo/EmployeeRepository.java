package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.affan.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
