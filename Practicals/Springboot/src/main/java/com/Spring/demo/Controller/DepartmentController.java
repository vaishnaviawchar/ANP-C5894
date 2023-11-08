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

import com.Spring.demo.service.DepartmentServices;

import jakarta.validation.Valid;

@RestController
public class DepartmentController 
{
	@Autowired
	DepartmentServices ds;
	
	
	
	@GetMapping("/Department/getDepartment/{did}")
	public ResponseEntity<Department> getDepartment(@PathVariable("did") int did)
	{
		return new ResponseEntity<Department> (ds.getDepartmentDetails(did),HttpStatus.OK);
	}
	
	@PutMapping("/Department/updateDepartment/{did}")
	public ResponseEntity<Department> updateDepartment(@PathVariable("did") int did, @RequestBody @Valid Department department)
    {
		return new ResponseEntity<Department> (ds.UpdateDepartmentDetails(department, did), HttpStatus.OK);
		
	}
	
	
	@GetMapping("/Department/getAllDepartments")
	public ResponseEntity<List<Department>> getAllDepartments()
    {
        List<Department> department = ds.getAllDepartments();
        return new ResponseEntity<List<Department>>(department, HttpStatus.OK);
    }
	

	@GetMapping("/Department/getDepartmentsByName/{dname}")
	public ResponseEntity<List<Department>> getDepartmentsByName(@PathVariable String dname)
    {
        List<Department> departmentbyName = ds.getDepartmentbyName(dname);
        return new ResponseEntity<List<Department>>(departmentbyName, HttpStatus.OK);
    }
	
	
	
 

}
