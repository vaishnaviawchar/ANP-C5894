package loops;
import java.util.*;
/*Write a Java program that takes an integer as input 
 * and checks if it is positive or negative. 
 * Print "Positive" if the number is greater than 0, 
 * and "Negative" if it is less than 0.*/
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
		s.close();

	}

}
