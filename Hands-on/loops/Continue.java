package loops;
/*
The continue statement in Java is used to skip the remaining code
within a loop iteration and proceed to the next iteration.
It is primarily used to control the flow of a loop and 
selectively skip certain iterations based on a condition.
*/

/*
Ques.Write a the program that asks the user for the number of iterations 
they want to perform. It then uses a for loop to iterate from 1 
to the specified number of iterations.
*/

//importing scanner class
import java.util.Scanner;
public class Continue 
{
	public static void main(String[] args) 
	{
		//scanner class to take the input from user
		Scanner sc = new Scanner(System.in);
		
		//Get the number of iterations from the user
		System.out.println("Enter the number of iterations: ");
		int iterations = sc.nextInt();
		
		// Perform a loop for the given number of iterations
		for(int i=1; i<=iterations; i++)
		{
			//Check if the current iteration is divisible by 3
			if(i%3==0)
			{
				// Skip this iteration and continue to the next one
				continue;
			}
			
			  // Print the current iteration number
			System.out.println("iterations: " +i);

			// Check if the current number is greater than or equal to 10
			if(i>=10)
			{
				// Break the loop if the condition is true
				break;
			}
		}
		sc.close();
	}

}
