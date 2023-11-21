package com.hibernaterelationship.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
    @Id
    @Column(name = "dId")
    private int dId;

    @Column
    private String dName;

    @OneToMany(mappedBy = "department")
    private List<Employee> e = new ArrayList<Employee>();

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Employee> getE() {
		return e;
	}

	public void setE(List<Employee> e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", e=" + e + "]";
	}
    
}