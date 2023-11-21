package operators;
/*.Write a Java program that prompts the user to enter their age.
 * The program should check if the age is between 18 and 30 (inclusive)
 * and print "Eligible for Job" if true, 
 * or "Not Eligible for Job" otherwise.*/
import java.util.Scanner;
public class AgeCheck 
{
	public static void main(String[] args) 
	{
		//input from the user
		Scanner sc = new Scanner(System.in);
		
		//get the age from user
		System.out.println("Enter the age: ");
		
		//integer input for age
	    int age = sc.nextInt();
		
	    //if condition to check age is between 18 and 30
		if(age>=18 && age<=30)
		{
			System.out.println("Eligible for Job");
		}
		else
		{
			System.out.println("Not Eligible for Job");
		}
		sc.close();
	}

}
