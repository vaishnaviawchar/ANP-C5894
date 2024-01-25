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
public class PatientDTO 
{
	private String name;
    private String password;
    private Long id;
    private String age;
    private String blood;
    private String prescription;
    private String dose;
    private String fees;
    private String Urgency;
    private String Remark;
    
   
}
