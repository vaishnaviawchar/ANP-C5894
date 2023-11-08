package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.entity.Batch;
import com.Spring.demo.exception.BatchIdNotFoundException;
import com.Spring.demo.repository.BatchRepository;
import com.Spring.demo.service.BatchServices;
@Service
public class BatchServicesImpl implements BatchServices
{
	@Autowired
	BatchRepository br;

	@Override
	public Batch addBatches(Batch batch) 
	{
		
		return br.save(batch) ;
	}

	@Override
	public Batch getBatchDetails(int bid) 
	{
		
		return br.findById(bid).orElseThrow(()-> new BatchIdNotFoundException("Batch id is not correct"));
	}

	@Override
	public List<Batch> getAllBatches() 
	{
		
		return br.findAll();
	}

}
