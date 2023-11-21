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

import com.Spring.demo.entity.Role;
import com.Spring.demo.services.RoleServices;

import jakarta.validation.Valid;

@RestController
public class RoleController 
{
	@Autowired
	RoleServices rs;
	
	@PostMapping("/Role/addRoles")
	public ResponseEntity<Role> addRoles(@Valid @RequestBody Role role)
	{
		return new ResponseEntity<Role> (rs.addRole(role),HttpStatus.CREATED);
	}
	
	@GetMapping("/Role/GetRoleDetails/{role_id}")
	public ResponseEntity<Role> getRoleDetails(@PathVariable("role_id") int role_id)
	{
		return new ResponseEntity<Role> (rs.getRoleDetails(role_id),HttpStatus.OK);
	}

	@PutMapping("/Role/updateRoleDetails/{role_id}")
	public ResponseEntity<Role> updateRoleDetails(@Valid @PathVariable("role_id") int role_id, @RequestBody Role role)
	{
		return new ResponseEntity<Role> (rs.updateRoleDetails(role, role_id),HttpStatus.OK);
	}
	
	@GetMapping("Role/getAllRoledetails")
	public ResponseEntity<List<Role>> getAllRoleDetails()
	{
		List<Role> role=rs.getAllRoles();
		return new ResponseEntity<List<Role>> (role,HttpStatus.OK);
	}
}
