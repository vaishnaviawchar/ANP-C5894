package com.Spring.demo.service;

import java.util.List;

import com.Spring.demo.entity.Department;


public interface DepartmentServices 
{
    
	
    Department getDepartmentDetails(int did);
	
    Department UpdateDepartmentDetails(Department department, int did);
	
	List<Department> getAllDepartments();

	List<Department> getDepartmentbyName(String dname);
}
