package com.Spring.demo.service;

import java.util.List;

import com.Spring.demo.entity.Teacher;

public interface TeacherService 
{
	Teacher addTeacher(Teacher teacher);
	
	Teacher getTeacherdetails(int tid);
	
	Teacher UpdateTeacherdetails(Teacher teacher, int tid);
	
	void DeleteTeacherdetails(int tid);

	List<Teacher> getAllTeachers(); 
	
	Teacher getTeacherByPhone(long phone);
	
	List<Teacher> getTeacherByName(String tname);
	
	List<Teacher> getTeacherDesignation(String designation);
	
}
