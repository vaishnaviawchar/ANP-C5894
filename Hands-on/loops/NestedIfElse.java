package loops;
import java.util.*;
/*Write a Java program that takes a year as input and checks if it is a leap year. 
 *If the year is divisible by 4, check if it is also divisible by 100. 
 *If it is divisible by 100, check if it is also divisible by 400. 
 *Print "Leap Year" if it satisfies all the conditions,and "Not a Leap Year" otherwise.*/
public class NestedIfElse 
{
	public static void main(String[] args)
	{
		//scanner class to take input from user
		Scanner z = new Scanner(System.in);
		System.out.println("Enter a year");
		//integer input from user
		int year = z.nextInt();
		//Condition
		if (year % 4 == 0)
		{
			System.out.println("year is a leap year");
		}
		else if (year % 100 == 0)
		{
			System.out.println("year is a leap year");
		}
		else if(year % 400 == 0)
		{
			System.out.println("year is a leap year");
		}
		else
		{
			System.out.println("year is not a leap year");
		}
		z.close();
		   
	}

	
}
