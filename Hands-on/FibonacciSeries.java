package loops;
/*Write a program that prints the Fibonacci series up to a specified limit entered by the user. 
 *However, skip printing numbers that are divisible by 3. 
 *Use the continue statement to skip such numbers.*/
import java.util.Scanner;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		//get the limit from user
		System.out.print("Enter the limit for the Fibonacci series: ");
		//integer input from user
        int limit = sc.nextInt();

        //declaring and initializing num1 by 0
        int number1 = 0;
        //declaring and initializing num2 by 0
        int number2 = 1;
        //declaring and initializing sum by addition of num1 and num2
        int sum = number1 + number2;

        System.out.println("Fibonacci series up to " + limit + ":");
        System.out.print(number1 + " " + number2 + " ");
        
        //while condition to sum is less than equal to limit enter by user
        while (sum <= limit) 
        {
            number1 = number2;
            number2 = sum;
            System.out.print(sum + " ");
            sum = number1 + number2;
            
            //if condition to check sum is divisible by 3
            if (sum % 3 == 0) 
            {
            	//skip the number divisible by 3
                continue;
            }
        }
    }
}