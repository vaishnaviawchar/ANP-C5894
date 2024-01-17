package com.SpringEmployee.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringEmployee.demo.Exception.LeaveNotFoundException;
import com.SpringEmployee.demo.Model.Leave;
import com.SpringEmployee.demo.Repository.LeaveRepository;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1/Leaves")
@RestController
public class LeaveController 
{
	@Autowired
	private LeaveRepository lr;
	
	@GetMapping
	public List<Leave> getAllLeaves()
	{
		return lr.findAll();
	}
	
	@PostMapping
	public Leave createLeave(@RequestBody Leave leave)
	{
		return lr.save(leave);
	}
	
	@PutMapping("/{leaveId}")
	public ResponseEntity<Leave> updateLeave(@RequestBody Leave leavedetails, @PathVariable int leaveId)
	{
		Leave leave=lr.findById(leaveId).orElseThrow(()-> new LeaveNotFoundException("Detail Not Found"));
		leave.setFromDate(leavedetails.getFromDate());
		leave.setReason(leavedetails.getReason());
		leave.setToDate(leavedetails.getToDate());
		Leave updateleave=lr.save(leave);
		return ResponseEntity.ok(updateleave);
	}
	
	@DeleteMapping("/{leaveId}")
	public ResponseEntity<Map<String, Boolean>> deleteLeave(@PathVariable int leaveId)
	{
		Leave leave=lr.findById(leaveId).orElseThrow(()-> new LeaveNotFoundException("Detail Not Found"));
		lr.delete(leave);
		Map<String, Boolean> response=new HashMap<>();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/{leaveId}")
	public ResponseEntity<Leave> getLeaveById(@PathVariable int leaveId)
	{
		Leave leave=lr.findById(leaveId).orElseThrow(()-> new LeaveNotFoundException("Detail Not Found"));
		return ResponseEntity.ok(leave);
	}
	

}
