package com.HospitalManagement.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Data
public class DoctorDTO 
{
	private Long did;
	private String firstName;
    private String lastName;
    private String specialization;
    private String licenseNumber;
    private String email;
    private String mobileNo;
	
	
	

}
