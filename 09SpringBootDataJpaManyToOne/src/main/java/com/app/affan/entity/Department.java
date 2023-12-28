package com.app.affan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="depttab")

public class Department {
	
	  @Id
	  @Column(name="did")
      private Integer deptId;
	  
	  @Column(name="dname")
      private String deptName;
	  
	  @Column(name="dadmin")
      private String deptAdmin;
 
}
