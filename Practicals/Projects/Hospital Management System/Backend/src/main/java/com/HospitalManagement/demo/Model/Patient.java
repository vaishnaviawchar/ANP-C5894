package com.HospitalManagement.demo.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Patient 
{
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	@Column
	private String password;
	@Column(name = "age")
	private String age;
	@Column(name = "blood_group")
	private String blood;
	@Column(name = "prescription")
	private String prescription;
	@Column(name = "dose")
	private String dose;
	@Column(name = "fees")
	private String fees;
	@Column
	private String Urgency;
	@Column
	private String Remark;
	
	@ManyToOne
    @JoinColumn(name = "doctor_id")
	@JsonIgnore 
    private Doctor doctor;
}