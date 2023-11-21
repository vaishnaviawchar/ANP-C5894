package com.Spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer>
{

}
