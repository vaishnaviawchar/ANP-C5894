package loops;
import java.util.*;
//if else program to check number is positive or not
public class Number 
{

	public static void main(String[] args)
	{
		//scanner class to take input from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		//integer input from user
		int b=s.nextInt();
		//Condition
		if(b>0)
		{
			System.out.println("Number is positive");
		}
		else if(b<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is 0");
		}
		

	}

}
