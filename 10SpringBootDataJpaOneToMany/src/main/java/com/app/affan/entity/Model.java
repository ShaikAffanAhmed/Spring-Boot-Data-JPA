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
@Table(name="modeltab")
public class Model {
  
	@Id
	@Column(name="mid")
	private Integer modelId;
	
	@Column(name="mcode")
	private String modelCode;
	
	@Column(name="mdata")
	private String modelData;
	
}

