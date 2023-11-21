package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Batch;
import com.Spring.demo.service.BatchServices;

import jakarta.validation.Valid;

@RestController
public class BatchController 
{
	@Autowired
	BatchServices bs;
	
	@PostMapping("/Batch/addBatch")
	public ResponseEntity<Batch> saveBatch(@Valid @RequestBody Batch batch)
	{
		return new ResponseEntity<Batch>(bs.addBatches(batch),HttpStatus.OK);
		
	}
	
	@GetMapping("/Batch/getBatch/{bid}")
	public ResponseEntity<Batch> getBatchDetails(@PathVariable("bid")  int bid)
	{
		return new ResponseEntity<Batch> (bs.getBatchDetails(bid),HttpStatus.OK);
		
	}
	
	@GetMapping("/Batch/getAllBatches")
	public ResponseEntity<List<Batch>> getAllBatches()
	{
		List<Batch> batch=bs.getAllBatches();
		return new ResponseEntity<List<Batch>>(batch, HttpStatus.OK);
		
	}

}
