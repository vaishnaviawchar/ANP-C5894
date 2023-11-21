package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.entity.Student;
import com.Spring.demo.exception.StudentIdNotFoundException;
import com.Spring.demo.repository.StudentRepository;
import com.Spring.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository srepo;

	@Override
	public Student addStudetns(Student student) 
	{
		
		return srepo.save(student);
	}

	@Override
	public Student getStudentDetails(int sid) 
	{
		
		return srepo.findById(sid).orElseThrow(()-> new StudentIdNotFoundException("Student Id is not correct"));
	}

	@Override
	public Student UpdateStudentDetails(Student student, int sid) 
	{
		Student updatedStudent = srepo.findById(sid).orElseThrow(()-> new StudentIdNotFoundException("Student Id is not correct"));
		
		updatedStudent.setSname(student.getSname());
		srepo.save(updatedStudent);
		
		return updatedStudent;
	}

	@Override
	public void deleteStudentDetails(int sid) 
	{
		srepo.findById(sid).orElseThrow(()-> new StudentIdNotFoundException("Student Id is not correct"));
		srepo.deleteById(sid);
	}
	
	@Override
	public List<Student> getAllStudents()
	{
		return srepo.findAll();
		
	}
	
	@Override
	public List<Student> getStudentbyseduc(String seduc)
	{
		return srepo.findByseduc(seduc);
		
	}

	 @Override
	    public List<Student> getStudentbyName(String sname) {
	        return srepo.findBySname(sname);
	    }
}


