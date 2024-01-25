package com.HospitalManagement.demo.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity
public class Doctor 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

	@Column(name = "first_name")
    private String firstName;
	
	@Column(name = "last_name")
    private String lastName;
	
	@Column(name = "specialization")
	private String specialization;

	@Column(name = "license_number")
	private String licenseNumber;

    @Column(name = "email")
    private String email;
    
    @Column
    private String mobileNo;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Patient> patients = new ArrayList<>();

	}
	

