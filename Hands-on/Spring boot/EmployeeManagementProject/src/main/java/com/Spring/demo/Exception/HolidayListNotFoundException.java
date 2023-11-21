package com.Spring.demo.Exception;

public class HolidayListNotFoundException extends RuntimeException
{
	private static final long serialVersionUID =1L;
	public HolidayListNotFoundException(String message) 
	{
		super(message);
	}

}
