package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.UserIdNotFoundException;
import com.Spring.demo.Repository.UserRepository;
import com.Spring.demo.entity.User;
import com.Spring.demo.services.UserServices;
@Service
public class UserServiceImpl implements UserServices
{
	@Autowired
	UserRepository ur;

	@Override
	public User addUser(User user) 
	{
		
		return ur.save(user);
	}

	@Override
	public User getUserDetails(int user_id) 
	{
		
		return ur.findById(user_id).orElseThrow(()-> new UserIdNotFoundException("User Id Is not correct"));
	}

	@Override
	public User updateUserDetails(User user, int user_id) 
	{
		User updataedUser=ur.findById(user_id).orElseThrow(()-> new UserIdNotFoundException("User Id Is not correct"));
		updataedUser.setUser_name(user.getUser_name());
		updataedUser.setStatus(user.getStatus());
		ur.save(updataedUser);
		
		return updataedUser;
	}

	@Override
	public List<User> getAllUsers() 
	{
		
		return ur.findAll();
	}

	@Override
	public List<User> getUserByName(String Username) 
	{
		
		return ur.findUsersByName(Username);
	}

}
