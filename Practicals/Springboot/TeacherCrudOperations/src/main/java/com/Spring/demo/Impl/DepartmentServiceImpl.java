package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.entity.Department;
import com.Spring.demo.exception.DepartmentIdNotFoundException;
import com.Spring.demo.repository.DepartmentRepository;
import com.Spring.demo.service.DepartmentServices;

@Service
public class DepartmentServiceImpl implements DepartmentServices
{
	@Autowired
	DepartmentRepository drepo;

	

	public Department getDepartmentDetails(int did) 
	{
		
		return drepo.findById(did).orElseThrow(()-> new DepartmentIdNotFoundException("Department id is not correct"));
		
	}

	@Override
	public Department UpdateDepartmentDetails(Department department, int did) 
	{
		
		Department updateddepartment= drepo.findById(did).orElseThrow(()-> new DepartmentIdNotFoundException("Department id is not correct"));
		
		updateddepartment.setDname(department.getDname());
		drepo.save(updateddepartment);
		return updateddepartment;
	}

	@Override
	public List<Department> getAllDepartments() 
	{
		
		return drepo.findAll();
	}

	@Override
	public List<Department> getDepartmentbyName(String dname) {
		
		return drepo.findByDname(dname);
	}


	

}
