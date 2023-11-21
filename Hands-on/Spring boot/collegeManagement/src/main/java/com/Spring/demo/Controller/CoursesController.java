package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Course;
import com.Spring.demo.service.CourseServices;

import jakarta.validation.Valid;

@RestController
public class CoursesController 
{
	@Autowired
	CourseServices cs;
	
	
	
	@GetMapping("/Course/getCourseDetails/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable("cid") int cid)
	{
		return new ResponseEntity<Course>(cs.getCourseDetails(cid), HttpStatus.OK);
	}
	
	@GetMapping("/Course/getAllCourses")
	public ResponseEntity<List<Course>> getAllCourses()
	{
		List<Course> course=cs.getAllCourse();
		return new ResponseEntity<List<Course>> (course,HttpStatus.OK);
		
	}
}
