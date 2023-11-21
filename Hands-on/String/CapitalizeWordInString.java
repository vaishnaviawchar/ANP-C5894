package com.String.sample;
//Java Program to capitalize each word in String

//importing scanner class 
import java.util.Scanner;

//Creating the class with a name CapitalizeWordInString 
public class CapitalizeWordInString 
{
	public static void main(String[] args) 
	{
		//Creating a Scanner class object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter a string
		System.out.println("Enter a String : ");
		//String input for variable input
		String input = sc.nextLine();
		
		//capitalizeWords function to capitalize words in the input string
		String capitalized = capitalizeWords(input);
		
		//Printing the capitalized string
		System.out.println("Capitalized String : " +capitalized);

	}

	//Function to capitalize each word in a string
	private static String capitalizeWords(String str) 
	{
		//Splitting the input string into words
		String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) 
        {
            if (!word.isEmpty()) 
            {
            	//Capitalize the first character of the word and append the rest
                result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
            }
        }
        //Convert the StringBuilder result to a string and remove trailing space
        return result.toString().trim();
	}

}
