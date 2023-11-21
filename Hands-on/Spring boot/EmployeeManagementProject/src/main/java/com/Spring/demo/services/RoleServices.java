package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.Role;

public interface RoleServices 
{
	Role addRole(Role role);
	
	Role getRoleDetails(int role_id);
	
	Role updateRoleDetails(Role role, int role_id);
	 
	List<Role> getAllRoles();

}