package com.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Husband 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int h_id;
	@Column(name="Husaband_name")
	private String h_name;
	
	@OneToOne

	private Wife wife;//association

	public int getH_id() {
		return h_id;
	}

	public void setH_id(int h_id) {
		this.h_id = h_id;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [h_id=" + h_id + ", h_name=" + h_name + ", wife=" + wife + "]";
	}
	
	

}
