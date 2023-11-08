package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.entity.Course;
import com.Spring.demo.exception.CourseIdNotFoundException;
import com.Spring.demo.repository.CourseRepository;
import com.Spring.demo.service.CourseServices;

@Service
public class CourseServicesImpl implements CourseServices
{
	@Autowired
	CourseRepository cr;

	

	@Override
	public Course getCourseDetails(int cid) 
	{
		
		return cr.findById(cid).orElseThrow(()-> new CourseIdNotFoundException("Course id is not correct"));
	}

	@Override
	public List<Course> getAllCourse() 
	{
		
		return cr.findAll();
	}

}
