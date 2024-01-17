package com.SpringEmployee.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringEmployee.demo.Model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> 
{
	List<Project> findByProjectName(String ProjectName);
	List<Project> findByDeptName(String deptName);

}
