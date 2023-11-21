package com.hibernate.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	private int studentId;
	@Column(name = "firstname")
	private String studentName;

	@Column(name = "lastname")
	private String studentlastName;

    
    @Column
    private String Address;
    
    @Column
    private String studentCourse;
    
    @Column
    private long mobileNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentlastName, String address, String studentCourse,
			long mobileNo) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentlastName = studentlastName;
		Address = address;
		this.studentCourse = studentCourse;
		this.mobileNo = mobileNo;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentlastName() {
		return studentlastName;
	}
	public void setStudentlastName(String studentlastName) {
		this.studentlastName = studentlastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
    public String toString() {
        // toString method to provide a string representation of the object
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentlastName=" + studentlastName + ", Address=" + Address + ", studentCourse=" + studentCourse + ", mobileNo=" + mobileNo + "]";
    }
	}
	
	
	
	


