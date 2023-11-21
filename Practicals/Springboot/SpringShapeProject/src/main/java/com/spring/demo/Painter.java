package com.spring.demo;

public class Painter implements Performer 
{
	Shape shape;

	
	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public void performer() 
	{
		System.out.println("Painter is");
		shape.draw();
		
	}


	
	
	

}
