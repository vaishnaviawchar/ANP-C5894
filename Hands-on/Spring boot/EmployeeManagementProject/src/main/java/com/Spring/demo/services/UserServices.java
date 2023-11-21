package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.User;

public interface UserServices 
{
	User addUser(User user);
	User getUserDetails(int user_id);
	User updateUserDetails(User user, int user_id);
	List<User> getAllUsers();
	List<User> getUserByName(String Username);

}
