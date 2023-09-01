package operators;
/*Write a Java program that takes an integer input from the user and 
 *checks if it is a power of 2 using bitwise operators. 
 *Print "Yes" if it is a power of 2, and "No" otherwise.*/

//Importing scanner class
import java.util.Scanner;
public class PowerOfTwoChecker 
{
	public static void main(String[] args) 
	{
		//scanner class to take user input
		Scanner sc = new Scanner(System.in);
		
		//Get integer from user
		System.out.println("Enter an integer: ");
		
		//integer input for number
		int number = sc.nextInt();
		 
		//if condition to check number is power of two or not
		if(number > 0 && (number & (number - 1)) == 0)
		{
			//printing if the condition is true
			System.out.println("Yes");
		}
		else
		{
			//printing if the condition is false
			System.out.println("No");
		}
		
		//closing the scanner class object
        sc.close();
        }
	}
