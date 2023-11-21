package com.Spring.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
@Entity
public class User 
{
	@Id
	private int user_id;
	@Column(length=20,nullable=false,unique=true)
	@NotBlank(message="user name cant be blank")
	private String user_name;
	@Column(length=20,nullable=false,unique=true)
	@NotBlank(message="user password cant be blank")
	private String user_password;
	@Column(length=11,nullable=false)
	private int mobNo;
	@Column(length=22,nullable=false)
	private String email;
	@Column(length =25, nullable=false)
	private String status;
	
	@OneToOne
	@JsonIgnoreProperties
	private Role role;

}
