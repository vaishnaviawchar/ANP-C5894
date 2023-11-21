package com.spring.demo;

public class Circle implements Shape
{
	private String color;

	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Circle(String color) {
		super();
		this.color = color;
	}



	
	@Override
	public void draw() 
	{
		System.out.println("DRWAING "+color+" CIRCLE...");
		
	}

}
