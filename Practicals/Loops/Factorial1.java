package loops;
import java.util.*;
/*Write a Java program that prompts the user to enter a positive integer 
 * and calculates its factorial using a while loop. 
 * The program should display the factorial as the output.*/
public class Factorial1 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//accepting positive integer from the user
		System.out.println("Enter a positive integer: ");
		
		//integer input from user
		int num1 = sc.nextInt();
    
        //declaring & initializing factorial1 to 1
    	int factorial1=1;
    	
    	//declaring & initializing i to 1
        int i = 1;
       
        //while condition to check i is less than equal to num1(number)
        while (i <= num1) 
        {
            factorial1 *= i;
            //incrementing i by 1
            i++;
          
        }
      
        //printing the result of factorial of number
      	System.out.println("The Factorial of " + num1 + "is :" +factorial1);
        sc.close();
		}
		
}

