package com.String.sample;
//Java Program to remove a particular character from a String.
import java.util.Scanner;
public class CharacterRemove 
{
	public static void main(String[] args) 
	{
		//Creating a Scanner class object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter a string
		System.out.println("Enter a String: ");
		//String input for variable input
		String input = sc.nextLine();
		
		//Prompts the user to enter a character to remove from a String
		System.out.println("Enter a character to remove from a String : ");
		
		//Takes the first character of the user input for the variable "chartoremove"
		char chartoremove = sc.next().charAt(0);
		
		//Using the replace method to create a modified string without the specified character
		String modifiedstring = input.replace(String.valueOf(chartoremove), "");
		
		//Printing the modified string after removing the specified character
		System.out.println("After removing a character from string : " +modifiedstring);
		
		//Closing the scanner class object
		sc.close();
	}
}
