package com.hibernate.query.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@NamedQuery(name="myquery", query="from Emp where id=1")
public class Emp 
{
	@Id
	private int eidd;
	@Column
	private String Name;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eidd, String name) {
		super();
		this.eidd = eidd;
		Name = name;
	}
	public int getEidd() {
		return eidd;
	}
	public void setEidd(int eidd) {
		this.eidd = eidd;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Emp [eidd=" + eidd + ", Name=" + Name + "]";
	}
	
	

}