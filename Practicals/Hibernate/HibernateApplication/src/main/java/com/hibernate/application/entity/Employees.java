package com.hibernate.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeee")
public class Employees 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	@Column(name="Firstname", length=30, nullable=false)
	private String employeeName;
	@Column(name="Designation", length=20, nullable=false)
	private String employeeDesignation;
	@Column(name="mobileno", nullable=false, unique=true)
	private int employeemob;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int employeeId, String employeeName, String employeeDesignation, int employeemob) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeemob = employeemob;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeemob() {
		return employeemob;
	}

	public void setEmployeemob(int employeemob) {
		this.employeemob = employeemob;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeemob=" + employeemob + "]";
	}
	
	
	

	
}
