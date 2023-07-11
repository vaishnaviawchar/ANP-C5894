package loops;
import java.util.*;
/*Write a Java program that takes an integer as input and checks if it is divisible by 2, 3, or both. 
 *Print "Divisible by 2" if it is divisible by 2, "Divisible by 3" if it is divisible by 3, 
 * and "Divisible by both 2 and 3" if it is divisible by both.*/
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
