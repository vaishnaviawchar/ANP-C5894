package com.Spring.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name="leave_application")
@Entity
public class Leave 
{
	@Id
	private int applicationId;
	
	@Column(length=50,nullable=false)
	private String subject;
	
	@Column(nullable=false)
	private LocalDate from_Date;
	
	@Column(nullable=false)
	private LocalDate to_Date;
	
	@Column(length=50,nullable=false)
	private String message;
	
	@Column(nullable=false)
	private int total_Days;
	
	@Column(length=25,nullable=false)
	private String status;
	
	@ManyToOne
	private Employee employee;

}
