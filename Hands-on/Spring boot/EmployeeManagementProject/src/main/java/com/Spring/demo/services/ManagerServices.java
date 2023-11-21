package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.Manager;

public interface ManagerServices 
{
	Manager addManager(Manager manager);
	
	Manager getMangerdetails(int manager_id);
	
	Manager updateManagerdetails(Manager manager, int manager_id);
	 
	List<Manager> getAllManagerDetails();

}
