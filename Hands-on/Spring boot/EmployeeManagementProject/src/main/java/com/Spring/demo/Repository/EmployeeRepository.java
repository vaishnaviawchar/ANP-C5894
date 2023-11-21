package com.Spring.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Spring.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
    @Query("SELECT e FROM Employee e WHERE e.emp_name = :empName")
    List<Employee> findEmployeeByName(@Param("empName") String empName);
    
    @Query("SELECT e FROM Employee e WHERE e.emp_name LIKE :empName")
    List<Employee> findEmployeesWithNameStartingWith(@Param("empName") String empName);

    @Query("SELECT e FROM Employee e WHERE e.emp_salary = (SELECT MAX(e2.emp_salary) FROM Employee e2)")
    Employee findEmployeeWithHighestSalary();
}
