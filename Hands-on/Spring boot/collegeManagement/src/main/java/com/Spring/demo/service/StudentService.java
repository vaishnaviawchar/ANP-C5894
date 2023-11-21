package com.Spring.demo.service;

import java.util.List;

import com.Spring.demo.entity.Student;
import com.Spring.demo.entity.Teacher;

public interface StudentService 
{
	Student addStudetns(Student student);
	
	Student getStudentDetails(int sid);
	
	Student UpdateStudentDetails(Student student, int sid);
	
	void deleteStudentDetails(int sid);
	
	List<Student> getAllStudents();
	
	List<Student> getStudentbyseduc(String seduc);
	
	List<Student> getStudentbyName(String sname);

}
