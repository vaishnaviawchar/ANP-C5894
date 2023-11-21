package com.SpringEmployee.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringEmployee.demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	

}
