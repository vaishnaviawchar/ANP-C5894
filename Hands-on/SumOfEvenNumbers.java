package loops;
/*Write a program that prompts the user to enter a series of integers. 
 *The program should calculate the sum of all the even numbers entered,
 *skipping any negative numbers. 
 *Use the continue statement to skip negative numbers.*/

//importing scanner class 
import java.util.Scanner;
public class SumOfEvenNumbers 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		//get the number of iterations from user
		System.out.println("Enter the series of integers: ");
		
		//declaring count variable
		int count=sc.nextInt();
		
		//declaring and initializing sum variable
		int sum=0;
		
		//for loop to get the series of number enter by user
		for (int i = 0; i < count; i++) 
		{
			//print the number enter by user
			System.out.println("enter the number: ");
            int number = sc.nextInt();
            
           //if condition to check number is less than zero
            if (number < 0) 
            {
            	 // Skip negative numbers
                continue;
            }

            // if condition to Check if the number is even
            if (number % 2 == 0) 
            {
            	//calculates the sum of even number
                sum += number;
            }
        }

        System.out.println("Sum of even numbers in the series: " + sum);
		}
	}


