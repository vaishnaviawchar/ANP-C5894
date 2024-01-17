package com.SpringEmployee.demo.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Employee_Leave")
@Data
public class Leave 
{
	@Id
	private int leaveId;
	@Column
	private String reason;
	@Column
	private LocalDate fromDate;
	@Column
	private LocalDate toDate;
	
}
