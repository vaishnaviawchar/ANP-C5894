package com.Spring.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;
@Data
@ToString
@Entity
public class Employee 
{
	@Id
	private int emp_id;
	@Column(length=25, nullable=false)
	@NotBlank(message="Employee name can't be blank")
	private String emp_name;
	@Column(length=10, nullable=false)
	@NotNull(message="Employee mobile no. can't be blank")
	private long phone;
	@Column(length=20, nullable=false)
	@NotBlank(message="Email can't be blank")
	@Email(message="email is not correct")
	private String email;
	@Column(length=10, nullable=false)
	private double emp_salary;
	
	@ManyToOne
	@JsonIgnoreProperties("employees")
	private Department dept;
	
	@ManyToOne
	@JsonIgnoreProperties
	private Manager manager;

}
