package com.Spring.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Spring.demo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

    @Query("SELECT d FROM Department d WHERE d.dept_name = :dept_name")
    List<Department> findDepartmentByName(@Param("dept_name") String dept_name);

}
