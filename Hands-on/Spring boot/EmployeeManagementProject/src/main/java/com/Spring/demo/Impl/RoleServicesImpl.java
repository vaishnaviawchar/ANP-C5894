package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.RoleIdNotFoundException;
import com.Spring.demo.Repository.RoleRepository;
import com.Spring.demo.entity.Role;
import com.Spring.demo.services.RoleServices;
@Service
public class RoleServicesImpl implements RoleServices
{
	@Autowired
	RoleRepository rr;

	@Override
	public Role addRole(Role role) 
	{
		
		return rr.save(role);
	}

	@Override
	public Role getRoleDetails(int role_id) 
	{
		
		return rr.findById(role_id).orElseThrow(()-> new RoleIdNotFoundException("Role id is not correct"));
	}

	@Override
	public Role updateRoleDetails(Role role, int role_id) 
	{
		Role updatedRole=rr.findById(role_id).orElseThrow(()-> new RoleIdNotFoundException("Role id is not correct"));
		updatedRole.setRole_Name(role.getRole_Name());
		rr.save(updatedRole);
		return updatedRole;
	}

	@Override
	public List<Role> getAllRoles() 
	{
		
		return rr.findAll();
	}

}
