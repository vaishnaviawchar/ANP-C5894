package com.SpringEmployee.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringEmployee.demo.Model.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer>{

}
