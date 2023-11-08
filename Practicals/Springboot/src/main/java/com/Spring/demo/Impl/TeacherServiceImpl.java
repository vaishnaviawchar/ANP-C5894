package com.Spring.demo.Impl;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.entity.Teacher;
import com.Spring.demo.exception.TeacherIdNotFoundException;
import com.Spring.demo.repository.TeacherRepository;
import com.Spring.demo.service.TeacherService;



@Service
public class TeacherServiceImpl implements TeacherService
{
	@Autowired
	TeacherRepository trepo;

	//use save() of Jpa repository for saving details
	@Override
	public Teacher addTeacher(Teacher teacher) 
	{
		return trepo.save(teacher);
		
		
	}

	@Override
	public Teacher getTeacherdetails(int tid) 
	{
		
		return trepo.findById(tid).orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	}

	@Override
	public Teacher UpdateTeacherdetails(Teacher teacher, int tid)
	{
		Teacher updatedTeacher = trepo.findById(tid).
		         orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));

		updatedTeacher.setPhone(teacher.getPhone());
		updatedTeacher.setDesignation(teacher.getDesignation());
		
		trepo.save(updatedTeacher); //saving updated details 
			return updatedTeacher; 
		
	}

	@Override
	public void DeleteTeacherdetails(int tid) 
	{
		trepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	    trepo.deleteById(tid);
		
	}
	
	@Override
    public List<Teacher> getAllTeachers() 
	{
        return trepo.findAll(); // Retrieve all teacher records from the repository
    }

	@Override
	public Teacher getTeacherByPhone(long phone) {
        return trepo.findByPhone(phone).orElseThrow();
    }

	@Override
	public List<Teacher> getTeacherByName(String tname) {
		// TODO Auto-generated method stub
		return trepo.findByTname(tname);
	}

	@Override
	public List<Teacher> getTeacherDesignation(String designation) {
		// TODO Auto-generated method stub
		return trepo.findByDesignation(designation);
	}
	
	
	
}
