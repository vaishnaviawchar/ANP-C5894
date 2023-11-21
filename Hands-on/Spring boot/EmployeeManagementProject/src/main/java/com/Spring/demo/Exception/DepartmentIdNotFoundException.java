package com.Spring.demo.Exception;

public class DepartmentIdNotFoundException extends RuntimeException
{
	private static final long serialVersionUID =1L;
	public DepartmentIdNotFoundException(String message) 
	{
		super(message);
	}

}
