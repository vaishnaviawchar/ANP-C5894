package exceptionhandling;
//DivideByZeroException example
import java.util.Scanner;
public class DivideByZeroExample 
{
	public static void main(String[] args) 
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		//prompts get the number1 from user
		System.out.println("Enter the number1: ");
		//integer input for num1
		int num1 = sc.nextInt();
		
		//prompts get the number2 from user
		System.out.println("Enter the number2: ");
		//integer input for num2
		int num2 = sc.nextInt();
		
		//try-catch block to handle the exception
		try
		{
			//Initializing and declaring variable result 
			int result = num1/num2;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("An exception occurred: "+e.getMessage());
			
		}
		//closing the scanner class object
		sc.close();
	}
}
