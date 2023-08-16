package exceptionhandling;
/*Write a program that takes two numbers and an operator (+, -, *, /) from the user.
 * Perform the corresponding arithmetic operation and display the result.
 * Handle exceptions for invalid operators and division by zero.*/
import java.util.Scanner;
public class ArithemeticOperationCalculator 
{
	public static void main(String[] args) 
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		//prompts user to enter first number
		System.out.println("Enter a first number : ");
		//integer input for number1
		int number1 = sc.nextInt();
		
		//prompts user to enter second number
		System.out.println("Enter a second number: ");
		//integer input for number2
		int number2 = sc.nextInt();
		
		System.out.println("Available Operators: ");
		System.out.println("1. + ");
		System.out.println("2. - ");
		System.out.println("3. * ");
		System.out.println("4. / ");
		System.out.println("Choose the Operator: ");
	    char operator=sc.next().charAt(0);
	    //Declaring variable result
		int result;
		
		try
		{
			//if condition to check operator is +
			if(operator == '+')
			{
				result= number1 + number2;
				System.out.println("The Addition is: "+result);
			   
			}
			
			//else if condition to check operator is -
			else if(operator == '-')
			{
				result = number1 - number2;
				System.out.println("The Substraction is: " +result);
			  
			}
			
			//else if condition to check operator is *
			else if(operator == '*')
			{
				 result= number1 * number2;
				 System.out.println("The Multiplication is: " +result);
		      
			}
			//else if condition to check operator is /
			else if(operator == '/')
			{
				
					result = number1 / number2;
					System.out.println("The Divivsion is: " +result);
			}
			
			else
			{
				//Throw the invalid operator exception
				throw new Exception("Invalid operator!!");
			}
			
		}
		
		//Catch block to handle ArithmeticException
		catch(ArithmeticException e)
		{
			System.out.println("Error: " +e.getMessage());
		}
		
		//To handle the invalid operator exception
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}

		//closing the scanner class object
		sc.close();
	}

}
