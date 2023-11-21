package exceptionhandling;
//Example of ArrayIndexOutOfBounds Exception
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionExample 
{
	public static void main(String[] args) 
    {
		//scanner class to take input from user
        Scanner sc = new Scanner(System.in);

        //get the size of the array from user
        System.out.println("Enter the size of the array: ");
        //integer input for size
        int size = sc.nextInt();
        
        //declaring array
        int[] array = new int[size];

        //get the elements from user
        System.out.println("Enter elements for the array:");
        
        //for loop to initialize the array
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Element " + i + ": ");
            array[i] = sc.nextInt();
        }

        //prompts to get the index of element 
        System.out.print("Enter an index to retrieve an element: ");
        //integer input for variable index
        int index = sc.nextInt();

        //try-catch block to handle the exception
        try 
        {
        	//Initializing variable element
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Array index out of bounds!");
        }
        //closing the scanner class object
        sc.close();
    }
}