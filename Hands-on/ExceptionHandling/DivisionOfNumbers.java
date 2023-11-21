package exceptionhandling;
/*Write a program that attempts to divide two numbers.
 *Whether the division is successful or not, make sure to display a "Division completed" message. 
 *Ensure that the division operation is performed in a try block 
 *and the "Division completed" message is displayed in a finally block.*/
import java.util.Scanner;
public class DivisionOfNumbers 
{
	public static void main(String[] args) 
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		//prompts to user to enter First number
		System.out.println("Enter a First Number: ");
		
		//Integer input for variable number1
		int number1 = sc.nextInt();
		
		//prompts to user to enter Second number
		System.out.println("Enter a Second Number: ");
		
		//Integer input for variable number2
		int number2 = sc.nextInt();
		
		try
		{
			//Declaring and Initializing variable result to calculate division.
			int result= number1/number2;
			//prints the division of number
			System.out.println("The Division of Number is: " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error!: "+e.getMessage());
		}
		finally
		{
			//Display the division completed message
			System.out.println("Division completed");
			
			//closing the scanner class object
			sc.close();
		}
		
	}

}
