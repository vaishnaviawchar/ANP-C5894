package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Manager;
import com.Spring.demo.services.ManagerServices;

import jakarta.validation.Valid;

@RestController
public class ManagerController 
{
	@Autowired
	ManagerServices ms;
	
	@PostMapping("/Manager/addManagerDetails")
	public ResponseEntity<Manager> addManagerDetails(@Valid @RequestBody Manager manager)
	{
		return new ResponseEntity<Manager> (ms.addManager(manager), HttpStatus.CREATED);
	}
	
	@GetMapping("/Manager/getManagerDetails/{manager_id}")
	public ResponseEntity<Manager> getManagerDetails(@PathVariable("manager_id") int manager_id)
	{
		return new ResponseEntity<Manager> (ms.getMangerdetails(manager_id), HttpStatus.OK);
	}
	
	@PutMapping("/Manager/updateManagerDetails/{manager_id}")
	public ResponseEntity<Manager> updateManagerDetails(@Valid @PathVariable("manager_id") int manager_id,@RequestBody Manager manager)
	{
		return new ResponseEntity<Manager> (ms.updateManagerdetails(manager, manager_id), HttpStatus.OK);
	}
	
	@GetMapping("/Manager/getAllManager")
	public ResponseEntity<List<Manager>> getAllManagerDetails()
	{
		List<Manager> manager=ms.getAllManagerDetails();
		return new ResponseEntity<List<Manager>>(manager,HttpStatus.OK);
	}

}
