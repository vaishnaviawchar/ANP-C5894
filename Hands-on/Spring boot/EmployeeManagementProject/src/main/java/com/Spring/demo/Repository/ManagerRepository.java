package com.Spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer>
{
	

}
