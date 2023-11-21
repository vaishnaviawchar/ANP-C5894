package array;
/*Write a program that takes the size of the array as input from the user.
 *Then, prompt the user to enter elements of the array.
 *Calculate and display the sum of all elements in the array.*/

import java.util.Scanner;
//creating class with name ArraySumCalculation
public class ArraySumCalculation 
{
	public static void main(String[] args)
	{
		//scanner class object to take input from user
	    Scanner sc = new Scanner(System.in);
        //get the size of the array from user
	    System.out.print("Enter the size of the array: ");
	    
	    //integer input from user 
	    int size = sc.nextInt();
        
	    //declaring the array
	    int[] numbers = new int[size]; 
        //prompts the user to enter the integers
	   
	    System.out.println("Enter " + size + " integers:");
        
	    //for loop condition to initializing the array
	    for (int i = 0; i < size; i++)
	    {
	    	numbers[i] = sc.nextInt();
	    }
	    // Display the elements entered by the user
	    System.out.println("Elements in the array:");
	    
	    //declaring and initializing variable sum to 0.
	    int sum=0;
	    
	    for (int i = 0; i < size; i++)
	    {
	    	//calculating the sum of all elements in the array.
	    	sum+=numbers[i];
	    	System.out.print(numbers[i] + " ");
	    }
		//printing the sum of all elements in the array
		System.out.println("The sum of all elements in the array is: "+sum);
		
		//closing the scanner class object
		sc.close();
		}
	}

