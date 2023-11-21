package com.Spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Batch;

public interface BatchRepository extends JpaRepository<Batch, Integer>
{

}
