package array;
//single dimension array example
import java.util.Scanner;
public class Array 
{
	public static void main(String[] args)
	{
		//scanner class object
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the size of the array: ");
	    int size = sc.nextInt();

	    int[] numbers = new int[size]; 

	    System.out.println("Enter " + size + " integers:");

	    for (int i = 0; i < size; i++)
	    {
	    	numbers[i] = sc.nextInt();
	    }
	    // Display the elements entered by the user
	    System.out.println("Elements in the array:");

	    for (int i = 0; i < size; i++)
	    {
	    	System.out.print(numbers[i] + " ");
	    }

	    //closing the scanner class object.
	    sc.close();
	    }
	}

