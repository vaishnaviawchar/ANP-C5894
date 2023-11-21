package com.Spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	

}
