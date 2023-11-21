package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.DepartmentIdNotFoundException;
import com.Spring.demo.Repository.DepartmentRepository;
import com.Spring.demo.entity.Department;
import com.Spring.demo.entity.Employee;
import com.Spring.demo.services.DepartmentServices;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Service
public class DepartmentServiceImpl implements DepartmentServices
{
	@Autowired
	DepartmentRepository dr;
	
	 @PersistenceContext
	   private EntityManager entityManager;

	@Override
	public Department addDepartment(Department department) 
	{
		
		return dr.save(department);
	}

	@Override
	public Department getDepartmentDetails(int dept_id) 
	{
		
		return dr.findById(dept_id).orElseThrow(()-> new DepartmentIdNotFoundException("Department id is not correct"));
	}

	@Override
	public Department updateDepartment(Department department, int dept_id) 
	{
		Department updateddepartment= dr.findById(dept_id).orElseThrow(()-> new DepartmentIdNotFoundException("Department id is not correct"));
		updateddepartment.setDept_name(updateddepartment.getDept_name());
		updateddepartment.setNoOfEmpl(updateddepartment.getNoOfEmpl());
		dr.save(updateddepartment);
		return updateddepartment;
	}

	@Override
	public List<Department> getAllDepartment() 
	{
		
		return dr.findAll();
	}

	@Override
	public List<Department> getDepartmentByName(String dept_name) 
	{
		TypedQuery<Department> query = entityManager.createQuery("SELECT d FROM Department d WHERE d.dept_name = :dept_name", Department.class);
        query.setParameter("dept_name", dept_name );
        return query.getResultList();
	}

}
