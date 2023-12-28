package com.app.affan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emptab1")

public class Employee {

	 @Id
	 @Column(name="eid")
     private Integer empId;
	  
	 @Column(name="ename")
     private String empName;

	 @Column(name="esal")
     private Double empSalary;
	 
	 @ManyToOne
	 @JoinColumn(name="didFK")
	 private Department dob;
	 
}
