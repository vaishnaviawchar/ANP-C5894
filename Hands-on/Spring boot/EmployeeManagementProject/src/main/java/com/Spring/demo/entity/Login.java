package com.Spring.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Login 
{

	@Id
	private int uid;
	@Column
	private String userName;
	@Column
	private String password;


}
