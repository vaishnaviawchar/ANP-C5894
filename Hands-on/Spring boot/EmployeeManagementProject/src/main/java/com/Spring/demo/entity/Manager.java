package com.Spring.demo.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
@Entity
public class Manager 
{
	@Id
	private int manager_id;
	@Column(length=20,nullable=false)
	@NotBlank(message="manager name cant be blank")
	private String manager_name;
	@Column(length=22, nullable=false)
	@NotBlank(message="Email cant be blank")
	@Email(message="email is not correct")
	private String email;
	@Column(length=20,nullable=false)
	private double salary;
	@Column(length=20,nullable=false)
	private String designation;
	@Column(nullable=false)
	private LocalDate doj;

	@OneToOne
	@JsonIgnoreProperties
	private Department dept;
	
	@OneToMany
	@JsonIgnoreProperties
	private List<Employee> employees;
}
