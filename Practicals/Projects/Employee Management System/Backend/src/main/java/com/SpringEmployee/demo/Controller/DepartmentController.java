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

import com.SpringEmployee.demo.Exception.DepartmentResourseNoutFound;
import com.SpringEmployee.demo.Model.Department;
import com.SpringEmployee.demo.Model.Employee;
import com.SpringEmployee.demo.Repository.DepartmentRepository;
import com.SpringEmployee.demo.Repository.EmployeeRepository;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController 
{

	@Autowired
	private DepartmentRepository dr;
	@Autowired
	private EmployeeRepository er;
	
	@GetMapping
	public List<Department> getAllDepartment()
	{
		return dr.findAll();
		
	}
	
	@PostMapping
	public Department createDepartment(@RequestBody Department department)
	{
		return dr.save(department);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Department> updateDepartment(@RequestBody Department departmentDetails,@PathVariable int id)
	{
		Department department=dr.findById(id).orElseThrow(()-> new DepartmentResourseNoutFound("Department id cant be blank"));
		department.setDeptName(departmentDetails.getDeptName());
		department.setNoofemployee(departmentDetails.getNoofemployee());
		
		Department updatedDepartment=dr.save(department);
		return ResponseEntity.ok(updatedDepartment);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDepartment(@PathVariable int id)
	{
		Department department= dr.findById(id).orElseThrow(()-> new DepartmentResourseNoutFound("Department id cant be blank"));
		
		dr.delete(department);
		Map<String, Boolean>response=new HashMap<>();
		return ResponseEntity.ok(response);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable int id)
	{
		Department department = dr.findById(id).orElseThrow(()-> new DepartmentResourseNoutFound("Department id cant be blank"));
		return ResponseEntity.ok(department);
	}
	
	@GetMapping("/byName/{deptName}")
	public List<Department> getDepartmentasByName(@PathVariable String deptName) {
	     return dr.findBydeptName(deptName);
	 }
	
	 @GetMapping("/{id}/employees")
	    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable int id) {
	        try {
	            Department department = dr.findById(id).orElse(null);

	            if (department == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }

	            List<Employee> employees = department.getEmployees();

	            return new ResponseEntity<>(employees, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	    @PostMapping("/{id}/addEmployee/{emp_id}")
	    public ResponseEntity<Department> addEmployeeToDepartment(
	            @PathVariable int id ,
	            @PathVariable int emp_id) {
	        try {
	            Department department = dr.findById(id).orElse(null);
	            Employee employee = er.findById(emp_id).orElse(null);

	            if (department == null || employee == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }

	            department.getEmployees();
	            dr.save(department);

	            return new ResponseEntity<>(department, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	}


