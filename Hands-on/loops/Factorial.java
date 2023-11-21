package loops;
import java.util.*;
//A program that prints the factorial of a given number from user input
public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the number to calculate its factorial: ");
		int num=d.nextInt();
		int factorial=1;
		for(int i=1; i<=num; i++)
		{
			factorial*=i;
		}
		System.out.println("The factorial of " +num+ "is:" +factorial);
	    d.close();
	}

}
