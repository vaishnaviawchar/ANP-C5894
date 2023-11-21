package loops;
import java.util.*;
/*Write a Java program that takes an integer as input 
 * and checks if it is divisible by 5 and 11.
 * Print "Divisible" if it is divisible by both,
 *  and "Not Divisible" otherwise.*/
public class Number1 
{
	public static void main(String[] args)
	{
		//scanner class to take input from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		//integer input from user
		int c=s.nextInt();
		//Condition
		if((c%5==0) && (c%11==0))
		{
			System.out.println("Number is divisible by 5 and 11");
		}
		else 
		{
			System.out.println("Number is not divisible by 5 and 11");
		}
		s.close();

	}

}
