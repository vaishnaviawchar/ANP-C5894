package exceptionhandling;
/*Write a program that takes an integer input from the user 
 *and throws this custom exception if the input is negative.
 *Catch the exception and display an error message accordingly.*/
import java.util.Scanner;

public class CustomExceptionHandling 
{
	public static void main(String[] args)
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		//prompts to user to enter a number
		System.out.println("Enter a number: ");
		
		//Integer input for variable number
		int number = sc.nextInt();
		
		try 
		{
			//if loop condition to checks the number is less than equal to zero.
			if(number<=0)
			{
				//If the number is non-positive (negative), handle the exception
				 throw new Exception("Negative input is not allowed");
            }
			//prints if the number is positive
			System.out.println("Number is positive");
		}
		
		catch(Exception e)
		{
			//Displays the error message.
			System.out.println("Error! "+e.getMessage());
			
		}
		
		finally
		{
			//closing the scanner class object
			sc.close();
		}
	}
}
