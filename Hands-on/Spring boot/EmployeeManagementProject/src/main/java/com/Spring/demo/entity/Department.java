package com.Spring.demo.entity;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;
@Data
@ToString
@Entity
public class Department 
{
	@Id
	private int dept_id;
	@Column(length=25, nullable=false,unique=true)
	@NotBlank(message="Department name can't be blank")
	private String dept_name;
	@Column(nullable=false)
	@NotNull(message="number of employee can't be blank ")
	private double noOfEmpl;
	
	@OneToMany
	@JsonIgnoreProperties("dept")
	private List<Employee> employees;


}
