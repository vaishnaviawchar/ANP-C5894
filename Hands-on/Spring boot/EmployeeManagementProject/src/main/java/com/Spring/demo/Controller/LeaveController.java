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

import com.Spring.demo.entity.Leave;
import com.Spring.demo.services.LeaveServices;

import jakarta.validation.Valid;

@RestController
public class LeaveController 
{
	@Autowired
	LeaveServices ls;
	
	
	@GetMapping("/Leave/getLeaveDetails/{applicationId}")
	public ResponseEntity<Leave> getLeaveDetails(@PathVariable("applicationId") int applicationId)
	{
		return new ResponseEntity<Leave> (ls.getLeave(applicationId),HttpStatus.OK);
		
	}
	
	@PutMapping("/Leave/updateLeaveDetails/{applicationId}")
	public ResponseEntity<Leave> updateLeaveDetails(@Valid @PathVariable("applicationId") int applicationId, @RequestBody Leave leave)
	{
		return new ResponseEntity<Leave> (ls.updateLeave(leave, applicationId),HttpStatus.OK);
		
	}
	

	@GetMapping("/Leave/getAllLeaveDetails")
	public ResponseEntity<List<Leave>> updateLeaveDetails()
	{
		List<Leave> leave=ls.getAllLeaves();
		return new ResponseEntity<List<Leave>>(leave,HttpStatus.OK);
		
	}


}
