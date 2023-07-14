package loops;
import java.util.Scanner;
/*
Java program that prompts the user to enter a positive integer
and calculates its factorial using a do-while loop. 
The program should continue to ask for input until 
a positive integer is entered.
*/
public class FactorialCalculator
{
	public static void main(String[] args)
	{
		//scanner class object
		Scanner d = new Scanner(System.in);
		 //variable declaration
		int number;
		 //do loop
		do
		{
			System.out.println("Enter a positive integer: ");
			 //user input
			number=d.nextInt();
		}
		//Test expression
		while(number<=0);
	    //variable factorial declaration & initialization
		int factorial=1;
		//variable i declaration & initialization
		int i =1;
		do 
		{
			factorial*=i;
			i++;
			
		}
		//print factorial of a number
		while(i<=number);
		//print factorial of a number
        System.out.println("The factorial of " + number + " is " + factorial);
        d.close();
		}

}
