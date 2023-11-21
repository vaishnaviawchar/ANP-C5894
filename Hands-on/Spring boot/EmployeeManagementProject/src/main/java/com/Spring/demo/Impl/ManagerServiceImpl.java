package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.ManagerIdNotFoundException;
import com.Spring.demo.Repository.ManagerRepository;
import com.Spring.demo.entity.Manager;
import com.Spring.demo.services.ManagerServices;
@Service
public class ManagerServiceImpl implements ManagerServices
{
	@Autowired
	ManagerRepository mr;

	@Override
	public Manager addManager(Manager manager) 
	{
		
		return mr.save(manager);
	}

	@Override
	public Manager getMangerdetails(int manager_id) 
	{
		
		return mr.findById(manager_id).orElseThrow(()-> new ManagerIdNotFoundException("Manager Id is not correct"));
	}

	@Override
	public Manager updateManagerdetails(Manager manager,int manager_id) 
	{
		Manager updatedmanager=mr.findById(manager_id).orElseThrow(()-> new ManagerIdNotFoundException("Manager Id is not correct"));
		updatedmanager.setManager_name(manager.getManager_name());
		updatedmanager.setDesignation(manager.getDesignation());
		mr.save(updatedmanager);
		return updatedmanager;
	}

	@Override
	public List<Manager> getAllManagerDetails() 
	{
		
		return mr.findAll();
	}
	

}
