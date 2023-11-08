package com.Spring.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Department {
    @Id
    private int did;
    
    @Column(length = 25, nullable = true)
    @NotBlank(message = "Department name can't be blank")
    private String dname;
    
    @Column(length = 25, nullable = true)
    private String dHod;
    
    @Column(nullable = true)
    @NotNull(message = "Kindly mention the number of employees")
    private Integer noOfEmpl;  // Change from int to Integer


	
	/*@OneToMany(mappedBy="department", fetch = FetchType.EAGER, cascade= CascadeType.ALL)
	@JsonManagedReference
	List<Teacher> teacherlist;*/

	
	
	

}
