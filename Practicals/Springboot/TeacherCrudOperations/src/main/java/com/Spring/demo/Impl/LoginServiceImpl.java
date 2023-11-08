package com.Spring.demo.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.entity.Login;
import com.Spring.demo.repository.LoginRepository;
import com.Spring.demo.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	LoginRepository lr;

	@Override
	public Login loginUser(String userName, String password) 
	{
		Login login=lr.findByUserNameAndPassword(userName, password);
		return login;
	}

}
