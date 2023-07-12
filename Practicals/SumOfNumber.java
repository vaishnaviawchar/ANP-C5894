package loops;
import java.util.*;
//program to print the sum of all numbers from users
public class SumOfNumber 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of values to sum : ");
		//integer input
		int count=s.nextInt();
		int sum=0;
		for(int i=1; i<=count; i++)
		{
			System.out.println("Enter the value #" +i+ ":");
			int value=s.nextInt();
			sum+=value;
		}
     System.out.println("The sum of all " + count + " numbers is: " + sum);
     s.close();
	}
	

}
