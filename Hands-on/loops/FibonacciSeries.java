package loops;
import java.util.Scanner;
public class FibonacciSeries
{
	    public static void main(String[] args) 
	    {
	        // Get the number of iterations from the user
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user for the limit
	        System.out.print("Enter the limit: ");
	        int limit = sc.nextInt();
	         
	        // Initialize the Fibonacci series variables
	        int firstNum = 0;
	        int secondNum = 1;

	        // Print the Fibonacci series
	        System.out.println("Fibonacci series:");

	        while (firstNum >= limit)
	        {
	            if (firstNum <= limit)
	            {
	                if (firstNum % 3 == 0)
	                {
	                    firstNum = firstNum + secondNum;
	                    secondNum = firstNum - secondNum;
	                    continue;
	                }

	                System.out.println(firstNum);
	            } 
	            
	            else
	            	
	            {
	                break;
	            }

	            // Calculate the next Fibonacci number
	            int nextNum = firstNum + secondNum;
	            
	            firstNum = secondNum;
	            
	            secondNum = nextNum;
	        }
	        sc.close();
	    }
	}