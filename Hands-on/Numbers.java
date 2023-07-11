package loops;
import java.util.*;
/*Write a Java program that takes an integer as input and checks if it is divisible by 2, 3, or both. 
 *Print "Divisible by 2" if it is divisible by 2, "Divisible by 3" if it is divisible by 3, 
 * and "Divisible by both 2 and 3" if it is divisible by both.*/
public class Numbers 
{

	public static void main(String[] args)
	{
		//scanner class to take input from user
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a number");
		//integer input from user
		int number= d.nextInt();
		//Condition
		if(number % 2 == 0 && number % 3 ==0)
		{
			System.out.println("Number is divisible by 2 and 3");
		}
		else if(number % 2 == 0)
		{
			System.out.println("Number is divisible by 2");
		}
		else if(number % 3 == 0)
		{
			System.out.println("Number is divisible by 3 ");
		}
		else
		{
			System.out.println("Number is not divisible by 2, 3, or both");
		}
		d.close();	
	}

}
