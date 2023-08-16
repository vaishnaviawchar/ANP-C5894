package exceptionhandling;
/*Develop a program that takes a user's age as input and determines if they are eligible to vote (age >= 18).
 *If the user enters non-numeric text or a negative number,
 *catch the NumberFormatException and IllegalArgumentException respectively,displaying appropriate error message*/
import java.util.Scanner;
public class AgeChecker 
{
	public static void main(String[] args) 
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		try
		{ 
			//Prompts user to enter a age
			System.out.println("Enter your age: ");
			
			//This line can throw NumberFormatException
			int age = Integer.parseInt(sc.nextLine());
			
			//if condition to check age is less than zero
			if(age<=0)
			{
				throw new IllegalArgumentException("Please enter a valid age!!");
			}
			//if condition to check age is less than equal to 18
		        if(age>=18)
			{
				System.out.println("Yor are eligible for vote! ");
			}
			else
			{
				System.out.println("You are not eligible for vote");
			}
			
		}
	        
		//Catch NumberFormatException to handle the non-numeric text
		catch(NumberFormatException e)
		{
			System.out.println("Error: Please enter a valid numeric age.");
		}
		
		//Catch IllegalArgumentException to handle negative number
		catch (IllegalArgumentException e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		//closing the scanner class object
		sc.close();

	}

}
