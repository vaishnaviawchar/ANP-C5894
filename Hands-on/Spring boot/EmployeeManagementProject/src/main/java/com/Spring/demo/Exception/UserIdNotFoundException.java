package com.Spring.demo.Exception;

public class UserIdNotFoundException extends RuntimeException
{
	public UserIdNotFoundException(String message) 
	{
		super(message);
	}


}
