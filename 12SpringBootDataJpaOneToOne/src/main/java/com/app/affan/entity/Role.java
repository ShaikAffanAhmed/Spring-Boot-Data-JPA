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
@Table(name="roletab")
public class Role {

	@Id
	@Column(name="rid")
	private Integer roleId;
	
	@Column(name="rcode")
	private String roleCode;
	
}
