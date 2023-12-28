package com.app.affan.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="stdtab")
public class Student {
  
	@Id
	@Column(name="sid")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE) //oracle
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.TABLE)//temp table to store next PK value
	@GeneratedValue(strategy = GenerationType.IDENTITY) //mysql
	
	private Integer stdId;
	@Column(name="sname")
	private String stdName;
	@Column(name="sfee")
	private Double stdfee;
	@Column(name="sdoj")
	//@Temporal(TemporalType.DATE)  //stores only date
	//@Temporal(TemporalType.TIME)  //stores only time
	@Temporal(TemporalType.TIMESTAMP)  //stores both date and time (default)
	private Date stdDoj;
	
}
