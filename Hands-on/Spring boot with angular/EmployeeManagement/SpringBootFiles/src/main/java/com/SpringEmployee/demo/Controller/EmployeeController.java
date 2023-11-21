package com.SpringEmployee.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringEmployee.demo.Exception.ResourseNotFoundException;
import com.SpringEmployee.demo.Model.Employee;
import com.SpringEmployee.demo.Repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository er;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return er.findAll();
		
	}
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return er.save(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Map <String, Boolean>> deleteEmployee(@PathVariable int id)
	{
		Employee employee =er.findById(id).orElseThrow(()-> new ResourseNotFoundException("Employee id not be blank"));
		er.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employeeDetails, @PathVariable int id)
	{
		Employee employee = er.findById(id).orElseThrow(()-> new ResourseNotFoundException("Employee not be blank"));
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		
		Employee updateEmployee=er.save(employee);
		return ResponseEntity.ok(updateEmployee);
		
	}
	
	 @GetMapping("/employee/{id}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) 
	 {
	        Employee employee = er.findById(id).orElseThrow(() -> new ResourseNotFoundException("Employee not found for ID: "));
	        return ResponseEntity.ok(employee);
	    }

}
