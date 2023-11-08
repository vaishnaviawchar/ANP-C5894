package com.Spring.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Spring.demo.entity.Student;
import com.Spring.demo.entity.Teacher;


public interface StudentRepository extends JpaRepository<Student, Integer>
{
	List<Student> findByseduc(String seduc);
	
	List<Student> findBySname(String sname);
	

}
