package loops;
/*Write a Java program that asks the user to enter a series of numbers (positive or negative) 
 *and calculates their sum. The program should stop asking for input when the user enters 0. 
 * Use a do-while loop to continuously ask for numbers and keep adding them to the sum.*/
import java.util.Scanner;
public class SumOfNumbers 
{

	public static void main(String[] args) 
	{
		//scanner class object
		Scanner f = new Scanner(System.in);
		//variable declaration
		int number;
		//initializing sum to 0
		int sum=0;
		 //do loop
		do
		{
			
			System.out.println("Enter a series of numbers (positive or negative) :");
			//user input
			number=f.nextInt();
			sum+=number;
		}
		  //Test expression
		while(number!= 0);
		//print the sum of series a number
		System.out.println("The sum is: " + sum);
		f.close();
    }

}


