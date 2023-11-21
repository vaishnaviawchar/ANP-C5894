package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.AdminNotFoundException;
import com.Spring.demo.Repository.AdminRepository;
import com.Spring.demo.entity.Admin;
import com.Spring.demo.services.AdminServices;

@Service
public class AdminServiceImpl implements AdminServices
{
	@Autowired
	AdminRepository ar;

	

	@Override
	public List<Admin> GetAllAdmins() 
	{
		
		return ar.findAll();
	}



	@Override
	public Admin getAdminDetails(int adminId) 
	{
		
		return ar.findById(adminId).orElseThrow(()-> new AdminNotFoundException("Admin id not found"));
	}

}
