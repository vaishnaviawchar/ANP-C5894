package com.Spring.demo.Exception;

public class RoleIdNotFoundException extends RuntimeException
{

	private static final long serialVersionUID =1L;
	public RoleIdNotFoundException(String message) 
	{
		super(message);
		
	}
	

}
