package com.String.sample;
//Write a Java Program to prove that strings are immutable in java.

import java.util.Scanner;
public class ImmutabilityofString 
{
	public static void main(String[] args) 
	{
		//Creating a Scanner class object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter a string
		System.out.println("Enter a String: ");
		
		//String input for variable originalString
		String originalString = sc.nextLine();
		
		//Prompts the user to enter a string to append
		System.out.println("Enter a string to append: ");
        String append = sc.nextLine();
        
        //Concatenates the originalString and append, creating a new string
        String modified = originalString.concat(append);
        
        //Prints the original and modified strings
        System.out.println("Original string: " + originalString);
        System.out.println("Modified string: " + modified);
        
        //Checks if both strings are the same using the == operator
        System.out.println("Are both strings the same? " + (originalString == modified));
        
        //Closing the scanner class object
        sc.close();
        
	}
}
