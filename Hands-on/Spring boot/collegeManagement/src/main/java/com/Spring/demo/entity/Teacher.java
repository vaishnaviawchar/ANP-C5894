package com.Spring.demo.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@ToString
public class Teacher 
{
	@Id
	private int tid;
	@Column(length=25, nullable=false)
	@NotBlank(message="Trainer name can't be blank")
	
	private String tname;
	@Column(length=22, nullable=false, unique=true)
	@NotBlank(message="Trainer surname can't be blank")
	
	private String sname;
	@Column(length=22, nullable=false, unique=true)
	@NotBlank(message="Trainer email can't be blank")
	@Email(message="Email id is not proper") 
	private String email;
	@Column(length = 11, nullable = false)
	@NotNull(message = "Phone number can't be null")
	private Long phone; 
	@Column(length=25,nullable=false)
	@NotBlank(message="Designation can't be blank")
	private String designation;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="deptID", referencedColumnName="did")
	@JsonBackReference
	private Department department;
	
	@OneToMany(mappedBy="teacher",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Batch> batchDetails;


	
	

}
