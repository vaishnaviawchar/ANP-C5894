package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.LeaveIdNotFoundException;
import com.Spring.demo.Repository.LeaveRepository;
import com.Spring.demo.entity.Leave;
import com.Spring.demo.services.LeaveServices;

@Service
public class LeaveServicesImpl implements LeaveServices
{ 
	@Autowired
	LeaveRepository lr;

	
	public Leave getLeave(int applicationId) 
	{
		
		return lr.findById(applicationId).orElseThrow(()-> new LeaveIdNotFoundException("Leave id not found"));
	}

	@Override
	public Leave updateLeave(Leave leave, int applicationId) 
	{
		
		Leave upadatedLeave= lr.findById(applicationId).orElseThrow(()-> new LeaveIdNotFoundException("Leave id not found"));
		upadatedLeave.setSubject(leave.getSubject());
		upadatedLeave.setMessage(leave.getMessage());
		
		lr.save(upadatedLeave);
		return upadatedLeave;
	}

	@Override
	public List<Leave> getAllLeaves() 
	{
		
		return lr.findAll();
	}

}
