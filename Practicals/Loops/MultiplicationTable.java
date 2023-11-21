package loops;
/*Write a Java program that prompts the user to enter a number and 
 * then prints the multiplication table of that number using a for loop. 
 *The table should display multiplication from 1 to 10.*/

//importing Scanner class
import java.util.Scanner;
//creating class with name MultiplicationTable
public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user.
		Scanner sc = new Scanner(System.in);
		//accepting the number from user.
		System.out.println("Enter a number: ");
		
		//integer input from user.
		int number=sc.nextInt();
		System.out.println("Multiplication of table" + number + "is:");
		
		//for loop condition to display the multiplication of table from 1 to 10.
		for(int i=1; i<=10; i++)
		{
			//storing the result of number*i in the variable result.
			int result = number * i;
			
			//printing the result of multiplication of table.
            System.out.println(number + " x " + i + " = " + result);
        }
		//closing the scanner class object
		sc.close();
	}
}


