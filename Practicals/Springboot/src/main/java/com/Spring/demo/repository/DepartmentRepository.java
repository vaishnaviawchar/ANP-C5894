package com.Spring.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Department;



public interface DepartmentRepository extends JpaRepository<Department, Integer>
{
	List<Department> findByDname(String dname);
}
