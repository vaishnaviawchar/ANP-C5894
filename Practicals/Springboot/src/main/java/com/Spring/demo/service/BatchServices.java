package com.Spring.demo.service;

import java.util.List;

import com.Spring.demo.entity.Batch;

public interface BatchServices 
{
	Batch addBatches(Batch batch);
	
	Batch getBatchDetails(int bid);
	
	List<Batch> getAllBatches();

}
