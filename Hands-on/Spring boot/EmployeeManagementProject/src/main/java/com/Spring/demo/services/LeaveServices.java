package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.Leave;

public interface LeaveServices 
{
	
	Leave getLeave(int applicationId);
	
	Leave updateLeave(Leave leave, int applicationId);
	
	List<Leave> getAllLeaves();

}
