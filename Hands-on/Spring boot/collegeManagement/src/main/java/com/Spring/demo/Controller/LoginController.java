package com.Spring.demo.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Login;
import com.Spring.demo.service.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;

@RestController
public class LoginController 
{
	@Autowired
	LoginService ls;
	@PostMapping("/login")
	public String validate(@RequestBody Login user) throws ServletException
	{
		String jwtToken="";
		if(user.getUserName()== null ||user.getPassword()== null)
		{
			throw new ServletException("Please fill your username and password");
		}
		
		String userName=user.getUserName();
		String password=user.getPassword();		
		
		user=ls.loginUser(userName, password);
		
		if(user==null)
		{
			throw new ServletException("User not Found");
		}
		
		jwtToken = Jwts.builder().setSubject(userName).claim("roles", "user").setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		
		return jwtToken;
	}

}
