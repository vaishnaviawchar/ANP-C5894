package com.Spring.demo.exception;

public class StudentIdNotFoundException extends RuntimeException
{
	private static final long serialVersionUID =1L;
	public StudentIdNotFoundException(String message) {
		super(message);
		
	}
}


