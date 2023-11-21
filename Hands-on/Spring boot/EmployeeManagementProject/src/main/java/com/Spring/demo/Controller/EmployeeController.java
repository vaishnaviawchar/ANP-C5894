package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Employee;
import com.Spring.demo.services.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService es;
	
	@PostMapping("/Employee/addEmployee")
	public ResponseEntity<Employee> addEmployeeDetails(@Valid @RequestBody Employee employee)
	{
		return new ResponseEntity<Employee> (es.addEmployee(employee), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/Employee/getEmployee/{emp_id}")
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("emp_id") int emp_id)
	{
		return new ResponseEntity<Employee> (es.getEmployeedetails(emp_id), HttpStatus.OK);
		
	}
	
	@PutMapping("/Employee/updateEmployee/{emp_id}")
	public ResponseEntity<Employee> updateEmployeeDetails(@Valid @PathVariable("emp_id") int emp_id, @RequestBody Employee employee)
	{
		return new ResponseEntity<Employee> (es.updateEmployeeDetails(employee, emp_id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/Employee/deleteEmployee/{emp_id}")
	public ResponseEntity<String> getEmployeeDetails(@Valid @PathVariable("emp_id") int emp_id, @RequestBody Employee employee)
	{
		es.deleteEmployeeDetails(emp_id);
		return new ResponseEntity<String> ("Employee id deleted successfully",HttpStatus.OK);
		
	}
	
	@GetMapping("/Employee/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> employee=es.getAllEmployees();
		return new ResponseEntity<List<Employee>> (employee,HttpStatus.OK);
		
	}
	
	@GetMapping("/Employee/getEmployeeByName/{emp_name}")
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String emp_name)
	{
		List<Employee> employee=es.getEmployeeByName(emp_name);
		return new ResponseEntity<List<Employee>> (employee,HttpStatus.OK);
	}
	
	@GetMapping("/Employee/getEmployeeByFirstletter")
	public ResponseEntity getEmployeeByFirstletter(@RequestParam("letter") String letter) 
	{
	    List<Employee> employees = es.getEmployeesWithNameStartingWith(letter + "%");
	    return ResponseEntity.ok(employees);
	}
	
	@GetMapping("/Employee/getEmployeeByHighestSalary")
	public ResponseEntity<Employee> getEmployeeWithHighestSalary() {
        Employee highestSalaryEmployee = es.getEmployeeByHighestSalary();
        return new  ResponseEntity<Employee> (highestSalaryEmployee, HttpStatus.OK);
    }
	

}
