package com.Spring.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student 
{
    @Id
    private int sid;
    
    @Column(length = 25, nullable = false)
    @NotBlank(message = "Student name can't be blank")
    private String sname;
    
    @Column(length = 25)
    private String lname;
    
    @Column(length = 11)
    private Long sphone;
    
    @Column(length = 25, unique = true)
    @Email(message = "Email is not correct")
    private String semail;
    
    @Column(length = 25, nullable = false)
    private String saddr;
    
    @Column(length = 25, nullable = false)
    @NotBlank(message = "Student education can't be blank")
    private String seduc;
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="courseId", referencedColumnName = "cid")
	@JsonBackReference
	private Course course;

	
	
	

}
