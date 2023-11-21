package com.String.sample;
//Write a program to reverse a string
import java.util.Scanner;
public class ReverseeString 
{
	public static void main(String[] args) 
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter a string
		System.out.println("Enter a String: ");
		
		//String input for variable input
		String input = sc.nextLine();
		
		//Call the reversedString function to get the reversed version of the input string
		String reversed = reversedString(input);
		
		//Printing the Reversed string
		System.out.println("Reversed string : " +reversed);
		
		//Closing the scanner class object
		sc.close();

	}
	private static String reversedString(String str) 
	{
		//Create a StringBuffer object containing the reversed version of the input string
		StringBuffer reversed = new StringBuffer(str).reverse();
		
		//Convert the StringBuffer to a regular String and return it
		return reversed.toString();
	}

}
