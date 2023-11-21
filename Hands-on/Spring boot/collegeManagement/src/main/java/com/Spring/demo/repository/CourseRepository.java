package com.Spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>
{

}
