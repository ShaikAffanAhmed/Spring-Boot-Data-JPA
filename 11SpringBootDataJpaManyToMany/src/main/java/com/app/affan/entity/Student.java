package com.app.affan.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="studenttab")
public class Student {

	@Id
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sname")
	private String stdName;
	
	@Column(name="smail")
	private String stdEmail;
	
	@ManyToMany
	@JoinTable(
			 name="stdcrstab",
	         joinColumns= @JoinColumn(name="sidFK"),
	         inverseJoinColumns = @JoinColumn(name="cidFK")
			)
	private List<Course> cobs;
}

