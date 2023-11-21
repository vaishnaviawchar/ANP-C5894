package com.SpringEmployee.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringEmployee.demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	List<Employee> findByFirstName(String firstName);
	// Custom query to find employees by city
    List<Employee> findByCity(String city);
    

}
