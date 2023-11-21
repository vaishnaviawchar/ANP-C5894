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
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Teacher;
import com.Spring.demo.service.TeacherService;

import jakarta.validation.Valid;

@RestController
public class TeacherController 
{
	@Autowired
	TeacherService ts;
	
	@PostMapping("/Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teacher)
	{
		return new ResponseEntity<Teacher> (ts.addTeacher(teacher), HttpStatus.CREATED);
	}
	
	@GetMapping("/Teacher/getTeacher/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid)
	{
		return new ResponseEntity<Teacher> (ts.getTeacherdetails(tid), HttpStatus.OK);
		
	}
	
	@PutMapping("/Teacher/updateTeacher/{tid}")
	public ResponseEntity<Teacher> updateTeacher(@Valid @PathVariable("tid") int tid, @RequestBody Teacher teacher)
	{
		return new ResponseEntity<Teacher> (ts.UpdateTeacherdetails(teacher, tid), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/Teacher/deleteTeacher/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid)
	{
		ts.DeleteTeacherdetails(tid);
		return new ResponseEntity<String> ("Deleted successfully", HttpStatus.OK);
		
	}
	
	 @GetMapping("/Teacher/getAllTeachers") // New endpoint for getting all teacher records
	    public ResponseEntity<List<Teacher>> getAllTeachers()
	    {
	        List<Teacher> teachers = ts.getAllTeachers();
	        return new ResponseEntity<List<Teacher>>(teachers, HttpStatus.OK);
	    }
	 
	 @GetMapping("Teacher/getTeacherByPhone/{phone}")
	 public ResponseEntity<Teacher> getTeacherByPhone(@PathVariable long phone) 
	 {
	        Teacher teacher = ts.getTeacherByPhone(phone);
	        return new ResponseEntity<>(teacher, HttpStatus.OK);
	    }
	 
	 @GetMapping("/Teacher/getTeacherByName/{tname}")
	 public ResponseEntity<List<Teacher>> getTeachersByName(@PathVariable String tname) {
	        List<Teacher> teachers = ts.getTeacherByName(tname);
	        return new ResponseEntity<>(teachers, HttpStatus.OK);
	    }
	 
	 @GetMapping("/Teacher/getTeacherByDesignation/{designation}")
	 public ResponseEntity<List<Teacher>> getTeachersByDesignation(@PathVariable String designation) {
	        List<Teacher> teachers = ts.getTeacherDesignation(designation);
	        return new ResponseEntity<>(teachers, HttpStatus.OK);
	    }
	 
	 
}
