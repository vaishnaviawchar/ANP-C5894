package loops;
//simple else if program
import java.util.*;
public class IfElse 
{
	public static void main(String[] args) 
	{
		//scanner class to take user input
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		//integer input from user
		int a=s.nextInt();
		                                                              
		//Condition
		if(a>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}

	}

}
