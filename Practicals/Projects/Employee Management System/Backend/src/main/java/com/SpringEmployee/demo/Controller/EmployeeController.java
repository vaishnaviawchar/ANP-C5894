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
import com.SpringEmployee.demo.Model.Department;
import com.SpringEmployee.demo.Model.Employee;
import com.SpringEmployee.demo.Repository.DepartmentRepository;
import com.SpringEmployee.demo.Repository.EmployeeRepository;


@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository er;
	@Autowired
	private DepartmentRepository dr;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return er.findAll();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return er.save(employee);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/{emp_id}")
	public ResponseEntity<Map <String, Boolean>> deleteEmployee(@PathVariable int emp_id)
	{
		Employee employee =er.findById(emp_id).orElseThrow(()-> new ResourseNotFoundException("Employee not be blank"));
		er.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		return ResponseEntity.ok(response);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/{emp_id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employeeDetails, @PathVariable int emp_id)
	{
		Employee employee = er.findById(emp_id).orElseThrow(()-> new ResourseNotFoundException("Employee not be blank"));
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		employee.setCity(employeeDetails.getCity());
		employee.setSalary(employeeDetails.getSalary());
		
		
		Employee updateEmployee=er.save(employee);
		return ResponseEntity.ok(updateEmployee);
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/{emp_id}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable int emp_id) 
	 {
	        Employee employee = er.findById(emp_id).orElseThrow(() -> new ResourseNotFoundException("Employee not found for ID: "));
	        return ResponseEntity.ok(employee);
	 }
	 @GetMapping("/byName/{firstName}")
	 public List<Employee> getEmployeesByName(@PathVariable String firstName) {
	     return er.findByFirstName(firstName);
	 }
	 @CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/byCityName/{city}")
	 public List<Employee> getEmployeesByCity(@PathVariable String city) {
	     return er.findByCity(city);
	 }
	 @CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/{emp_id}/department")
	 public ResponseEntity<Department> getDepartmentByEmployee(@PathVariable int emp_id) {
	     try {
	         Employee employee = er.findById(emp_id).orElse(null);

	         if (employee == null) {
	             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	         }

	         Department department = employee.getDepartment();

	         return new ResponseEntity<>(department, HttpStatus.OK);
	     } catch (Exception e) {
	         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	     }
	 }
	 @CrossOrigin(origins = "http://localhost:4200")
	 @PostMapping("/{emp_id}/assignDepartment/{id}")
	 public ResponseEntity<Map<String, Object>> assignDepartmentToEmployee(
	         @PathVariable int emp_id,
	         @PathVariable int id) {
	     try {
	         Employee employee = er.findById(emp_id).orElse(null);
	         Department department = dr.findById(id).orElse(null);

	         if (employee == null || department == null) {
	             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	         }

	         employee.setDepartment(department);
	         er.save(employee);

	         // Create a map to hold both employee and department details
	         Map<String, Object> response = new HashMap<>();
	         response.put("employee", employee);
	         response.put("department", department);

	         return new ResponseEntity<>(response, HttpStatus.OK);
	     } catch (Exception e) {
	         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	     }
	 }

	}

