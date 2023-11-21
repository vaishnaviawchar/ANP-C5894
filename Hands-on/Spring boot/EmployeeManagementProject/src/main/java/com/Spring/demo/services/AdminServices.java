package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.Admin;

public interface AdminServices 
{
	Admin getAdminDetails(int adminId);
	
	List<Admin> GetAllAdmins();

}
