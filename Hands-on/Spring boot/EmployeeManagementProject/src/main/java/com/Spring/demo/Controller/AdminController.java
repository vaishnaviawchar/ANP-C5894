package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Admin;
import com.Spring.demo.services.AdminServices;

@RestController
public class AdminController 
{
	@Autowired
	AdminServices as;
	
	@GetMapping("/Admin/getAdminDetails/{adminId}")
	public ResponseEntity<Admin> getAdminDetails(@PathVariable("adminId") int adminId)
	{
		return new ResponseEntity<Admin> (as.getAdminDetails(adminId),HttpStatus.OK);
	}
	
	@GetMapping("/Admin/getAllAdminDetails")
	public ResponseEntity <List<Admin>> getAllAdminDetails()
	{
		List<Admin> admin = as.GetAllAdmins();
		return new ResponseEntity <List<Admin>> (admin,HttpStatus.OK);
	}
	
	

}
