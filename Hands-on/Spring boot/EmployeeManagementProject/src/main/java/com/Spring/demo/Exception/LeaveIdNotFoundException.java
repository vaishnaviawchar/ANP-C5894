package com.Spring.demo.Exception;

public class LeaveIdNotFoundException extends RuntimeException
{
	private static final long serialVersionUID =1L;
	public LeaveIdNotFoundException(String message) 
	{
		super(message);
	}

}
