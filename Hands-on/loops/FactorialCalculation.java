package loops;
/*Write a Java program that prompts the user to enter a positive integer 
* and calculates its factorial using a while loop. 
* The program should display the factorial as the output.*/

//importing Scanner class.
import java.util.Scanner;
//creating class with a name FactorialCalculation
public class FactorialCalculation        
{  
	public static void main(String[] args) 
	{
		//scanner class to take input from user.
		//creating object of scanner class.
		Scanner sc = new Scanner(System.in);
		
		//accepting positive integer from the user.
		System.out.println("Enter a positive integer: ");
		
		//integer input from user.
		int num1 = sc.nextInt();
        
		//if loop condition to check num1 is less than 0.
        if(num1<0)
        {
        	System.out.println("Invalid input.Please Enter a positive integer!");
        }
        //while loop condition to check num1 is less than 0
        while (num1 < 0)
        {
        	
        }
        //declaring & initializing factorial1 to 1
    	int factorial1=1;
    		
    	//declaring & initializing i to 1
        int i = 1;
        
        //while loop condition to check i is less than equal to num1(number) 
        while (i <= num1) 
        {
        	//formula for calculating the factorial of number.
            factorial1 *= i;
            //incrementing i by 1.
            i++;
          
        }
      //printing the factorial of number.
      System.out.println("The Factorial of " + num1 + "is :" +factorial1);
      //closing the scanner class object.
      sc.close();
	}
}