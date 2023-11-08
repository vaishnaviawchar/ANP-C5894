package com.spring.demo;

public class Restuarant 
{
	HotDrinks hotDrink;
	String welcomeNote;

	public Restuarant(HotDrinks hotDrink)
	{
		super();
		this.hotDrink=hotDrink;
		
	}

	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	public void greetMessage()
	{
		System.out.println(welcomeNote);
	}
	public void prepareDrink()
	{
		hotDrink.prepareHotDrinks();
	}
	
}
