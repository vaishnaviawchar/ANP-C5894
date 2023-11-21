package com.Spring.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
	Optional<Teacher> findByPhone(long phone);

    List<Teacher> findByTname(String tname);

    List<Teacher> findByDesignation(String designation);

}
