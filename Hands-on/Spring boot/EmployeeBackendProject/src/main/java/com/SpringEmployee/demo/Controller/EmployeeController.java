package com.SpringEmployee.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api/v1/employees")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository er;
	
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return er.findAll();
		
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return er.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map <String, Boolean>> deleteEmployee(@PathVariable int id)
	{
		Employee employee =er.findById(id).orElseThrow(()-> new ResourseNotFoundException("Employee not be blank"));
		er.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employeeDetails, @PathVariable int id)
	{
		Employee employee = er.findById(id).orElseThrow(()-> new ResourseNotFoundException("Employee not be blank"));
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		employee.setCity(employeeDetails.getCity());
		employee.setSalary(employeeDetails.getSalary());
		
		
		Employee updateEmployee=er.save(employee);
		return ResponseEntity.ok(updateEmployee);
		
	}
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) 
	 {
	        Employee employee = er.findById(id).orElseThrow(() -> new ResourseNotFoundException("Employee not found for ID: "));
	        return ResponseEntity.ok(employee);
	 }
	 @GetMapping("/byName/{firstName}")
	 public List<Employee> getEmployeesByName(@PathVariable String firstName) {
	     return er.findByFirstName(firstName);
	 }
	 
	 @GetMapping("/byCityName/{city}")
	 public List<Employee> getEmployeesByCity(@PathVariable String city) {
	     return er.findByCity(city);
	 }

}