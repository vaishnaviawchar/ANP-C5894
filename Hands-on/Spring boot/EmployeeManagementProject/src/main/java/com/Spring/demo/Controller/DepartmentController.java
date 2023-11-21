package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Department;
import com.Spring.demo.entity.Employee;
import com.Spring.demo.services.DepartmentServices;

import jakarta.validation.Valid;

@RestController
public class DepartmentController 
{
	@Autowired
	DepartmentServices ds;
	
	@PostMapping("/Department/addDepartmentDetails")
	public ResponseEntity<Department> addEmployeedetails(@Valid @RequestBody Department department)
	{
		return new ResponseEntity<Department> (ds.addDepartment(department), HttpStatus.OK);
	}
	
	@GetMapping("/Department/getDepartmentDetails/{dept_id}")
	public ResponseEntity<Department> getEmployeedetails(@PathVariable("dept_id") int dept_id)
	{
		return new ResponseEntity<Department> (ds.getDepartmentDetails(dept_id), HttpStatus.OK);
	}
	
	@PutMapping("/Department/updateDepartmentdetails/{dept_id}")
	public ResponseEntity<Department> updateEmployeedetails(@Valid @PathVariable("dept_id") int dept_id, @RequestBody Department department)
	{
		return new ResponseEntity<Department> (ds.updateDepartment(department, dept_id), HttpStatus.OK);
	}
	
	@GetMapping("/Department/getAllDepartment/")
	public ResponseEntity<List<Department>> getAllEmployeedetails()
	{
		List<Department> department=ds.getAllDepartment();
		return new ResponseEntity<List<Department>> (department,HttpStatus.OK);
	}
	
	@GetMapping("/Department/getDepartmentByName/{dept_name}")
	public ResponseEntity<List<Department>> getEmployeeByName(@PathVariable String dept_name)
	{
		List<Department> department=ds.getDepartmentByName(dept_name);
		return new ResponseEntity<List<Department>> (department,HttpStatus.OK);
	}

}
