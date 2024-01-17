package com.SpringEmployee.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Project 
{
	@Id
	private int projectId;
	@Column
	private String projectName;
	@Column
	private String employeeName;
	@Column
	private String deptName;

}
