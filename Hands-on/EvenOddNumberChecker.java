package operators;
/*Write a Java program that takes an integer input from the user and 
 *checks if it is even or odd using bitwise operators. 
 *Print "Even" if the number is even, and "Odd" if the number is odd.*/
import java.util.Scanner;
public class EvenOddNumberChecker 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user
		Scanner sc =  new Scanner(System.in);
		//get the integer from user
		System.out.println("Enter an integer: ");
		//integer input from user
		int number = sc.nextInt();
		
		//if condition to check the number is even or odd
		if((number & 1) == 0)
		{
			//printing if the condition is true
			System.out.println("Number is Even");
		}
		else
		{
			//printing if the condition is false
			System.out.println("Number is odd");
		}
		
		//closing the scanner class object
		sc.close();
	}

}
