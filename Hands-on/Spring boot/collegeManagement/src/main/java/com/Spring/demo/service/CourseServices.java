package com.Spring.demo.service;

import java.util.List;

import com.Spring.demo.entity.Course;

public interface CourseServices 
{
	
	Course getCourseDetails(int cid);
	List<Course> getAllCourse();

}
