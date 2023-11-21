package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.EmployeeIdNotFoundException;
import com.Spring.demo.Repository.EmployeeRepository;
import com.Spring.demo.entity.Employee;
import com.Spring.demo.services.EmployeeService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository er;
	
	 @PersistenceContext
	   private EntityManager entityManager;

	@Override
	public Employee addEmployee(Employee employee) 
	{
		
		return er.save(employee);
	}

	@Override
	public Employee getEmployeedetails(int emp_id) 
	{
		
		return er.findById(emp_id).orElseThrow(()->new EmployeeIdNotFoundException("Employee id not found"));
	}

	@Override
	public Employee updateEmployeeDetails(Employee employee, int emp_id) 
	{
		Employee updatedemployee=er.findById(emp_id).orElseThrow(()-> new EmployeeIdNotFoundException("Employee id not found"));
		updatedemployee.setEmp_name(employee.getEmp_name());
		updatedemployee.setEmp_salary(employee.getEmp_salary());
		er.save(updatedemployee);
		return updatedemployee;
	}

	@Override
	public void deleteEmployeeDetails(int emp_id) 
	{
		er.findById(emp_id).orElseThrow(()->new EmployeeIdNotFoundException("Employee id not found"));
		er.deleteById(emp_id);
		
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		
		return er.findAll();
	}

	 @Override
	public List<Employee> getEmployeeByName(String emp_name)
	 {
	        TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.emp_name = :empName", Employee.class);
	        query.setParameter("empName", emp_name);
	        return query.getResultList();
	    }

	@Override
	public List<Employee> getEmployeesWithNameStartingWith(String letter) {
	    TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.emp_name LIKE :empName", Employee.class);
	    query.setParameter("empName", letter + "%");
	    return query.getResultList();
	}

	@Override
	public Employee getEmployeeByHighestSalary() 
	{
	    return er.findEmployeeWithHighestSalary();
	}

}
