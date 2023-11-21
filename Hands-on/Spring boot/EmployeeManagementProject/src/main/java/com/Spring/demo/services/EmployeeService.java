package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.Employee;

public interface EmployeeService 
{
	Employee  addEmployee(Employee employee);
	
	Employee getEmployeedetails(int emp_id);
	
	Employee updateEmployeeDetails(Employee employee,int emp_id);
	
    void deleteEmployeeDetails(int emp_id);
    
    List<Employee> getAllEmployees();
    
    List<Employee> getEmployeeByName(String emp_name);
    
    List<Employee> getEmployeesWithNameStartingWith(String letter);

    Employee getEmployeeByHighestSalary();
}
