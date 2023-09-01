package operators;
/*Write a Java program that takes two integer inputs from the user and
 *swaps their values using bitwise operators.
 *After swapping, print the updated values of the two integers.*/
import java.util.Scanner;
public class SwappingNumber 
{
	public static void main(String[] args) 
	{
		//scanner class to take user input
		Scanner sc = new Scanner(System.in);
		//get the first integer from user
		System.out.println("Enter the first integer: ");
		//declaring and initializing number1 variable
		int number1 = sc.nextInt();
		//get the Second integer from user
		System.out.println("Enter the second integer:");
		//declaring and initializing number2 variable
        int number2 = sc.nextInt();
        
        //printing before the swapping values
        System.out.println("Before swapping:");  
        System.out.println("Number1= " +number1);
        System.out.println("Number2= " +number2);
       
        //performing bitwise XOR operator to swap the numbers
        number1 = number1 ^ number2;
        number2= number1^ number2;
        number1 = number1 ^ number2;
        
        //printing After swapping the values
        System.out.println("After Swapping:");
        System.out.println("Number1= "+number1);
        System.out.println("Number2= "+number2);
       
        //closing the scanner class object
        sc.close();
        
	}

}
