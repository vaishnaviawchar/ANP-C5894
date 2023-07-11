package loops;
import java.util.*;
//program to check year is a leap year or not.
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
		   
	}

	
}
