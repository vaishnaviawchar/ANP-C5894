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

import com.Spring.demo.entity.User;
import com.Spring.demo.services.UserServices;

import jakarta.validation.Valid;

@RestController
public class UserController 
{
	@Autowired
	UserServices us;
	
	@PostMapping("/User/addUserDetails")
	public ResponseEntity<User> addUserDetails(@Valid @RequestBody User user)
	{
		return new ResponseEntity<User> (us.addUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/User/getUserDetails/{user_id}")
	public ResponseEntity<User> getUserDetails(@PathVariable("user_id") int user_id)
	{
		return new ResponseEntity<User> (us.getUserDetails(user_id),HttpStatus.OK);
	}
	
	@PutMapping("/User/updateUserDetails/{user_id}")
	public ResponseEntity<User> updateUserDetails(@Valid @PathVariable("user_id") int user_id, @RequestBody User user)
	{
		return new ResponseEntity<User> (us.updateUserDetails(user, user_id),HttpStatus.OK);
	}
	
	@GetMapping("/User/getALLUserDetails")
	public ResponseEntity<List<User>> getAllUserDetails()
	{
		List<User> user=us.getAllUsers();
		return new ResponseEntity<List<User>> (user,HttpStatus.OK);
		
	}
	
	@GetMapping("/User/getUserByName/{User_name}")
	public ResponseEntity<List<User>> getUserByName(String Username)
	{
		List<User> user=us.getUserByName(Username);
		return new ResponseEntity<List<User>> (user,HttpStatus.OK);
	}
	

}
