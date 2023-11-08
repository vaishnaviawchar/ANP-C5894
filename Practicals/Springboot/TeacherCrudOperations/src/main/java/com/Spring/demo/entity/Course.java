package com.Spring.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Course 
{
	@Id
	private int cid;
	@Column(length=20,nullable=true)
	@NotBlank(message="Course name can't be blank")
	private String courseName;
	@Column(length=20,nullable=true)
	@NotBlank(message="duration can't be blank")
	private String duration;
	@Column(length=20,nullable=true)
	@NotNull(message="Fees can't be blank")
	private double coursefees;
	
	
	@OneToOne(mappedBy="course" , fetch=FetchType.EAGER, cascade= CascadeType.ALL)
	@JsonManagedReference
	private Student student;


	
}