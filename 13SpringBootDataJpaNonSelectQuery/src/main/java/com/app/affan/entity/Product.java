package com.app.affan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_tab")
public class Product {

	@Id
	@Column(name="pid")
	private Integer prodId;
	
	@Column(
			name="pname",
			unique = true,
			nullable = false,
			insertable = true,
			updatable = false,
			length = 50
			)
	private String prodName;
	
	@Column(name="pcost")
	private Double prodCost;
	
}
