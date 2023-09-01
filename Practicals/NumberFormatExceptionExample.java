package exceptionhandling;
/*
 *In this example, the program prompts the user to enter a number. 
 *It then attempts to parse the user's input into an integer using Integer.
 *parseInt(). If the user enters non-numeric text, the NumberFormatException
 *unchecked exception can occur.
 *The try block contains the input and parsing operations.
 *If a NumberFormatException occurs, the catch block catches 
 *the exception and informs the user about the invalid input.
 */
import java.util.Scanner;

public class NumberFormatExceptionExample
{
    public static void main(String[] args)
    {
    	//scanner class to take input from user
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
        	//prompts user to enter a number
            System.out.print("Enter a number: ");
            // This line can throw NumberFormatException
            int number = Integer.parseInt(scanner.nextLine()); 
            System.out.println("You entered: " + number);
        } 
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input. Please enter a valid number.");
        }   
        scanner.close();       
        System.out.println("Program continues...");
    }
}
