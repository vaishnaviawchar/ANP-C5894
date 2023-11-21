package com.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Wife 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wife_id;
	@Column(name="wife_name")
	private String wife_name;
	
	
	@OneToOne
	private Husband husband;

	public int getWife_id() {
		return wife_id;
	}

	public void setWife_id(int wife_id) {
		this.wife_id = wife_id;
	}

	public String getWife_name() {
		return wife_name;
	}

	public void setWife_name(String wife_name) {
		this.wife_name = wife_name;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Wife [wife_id=" + wife_id + ", wife_name=" + wife_name + ", husband=" + husband + "]";
	}
	
	

}
