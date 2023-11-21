package com.spring.demo;

public class Rectangle implements Shape
{
	private String color;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void draw() {
		System.out.println("Drwaing"+color+" Reactangle");
		
	}

}
