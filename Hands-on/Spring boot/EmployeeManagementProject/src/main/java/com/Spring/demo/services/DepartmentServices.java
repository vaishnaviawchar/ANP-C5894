package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.Department;

public interface DepartmentServices 
{
	Department addDepartment(Department department);
	
	Department getDepartmentDetails(int dept_id);
	
	Department updateDepartment(Department department,int dept_id);
	
	List<Department> getAllDepartment();
	
	List<Department> getDepartmentByName(String dept_name);
	

}
