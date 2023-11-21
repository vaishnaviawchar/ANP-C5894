package array;
//Write a Java program to find the average of all elements in an array of doubles.
import java.util.Scanner;
public class ArrayAvarageCalculation 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user.
		Scanner sc = new Scanner(System.in);
		//get the size of the array from user
		System.out.println("Enter the number of elements: ");
		
		//integer input from user
		int number=sc.nextInt();
		
		//declaring the array
		double [] array=new double[number];
		
		//prompts the user to enter the elements.
		System.out.println("Enter the " +number+ " elements: ");
		
		//for loop condition to initialize the array
		for(int i=0; i<number; i++)
		{
			array[i]=sc.nextDouble();
		}
		//display the elements in the array
		System.out.println("Elements in the array: ");
		
		//declaring and initializing the variable sum to 0.
		double sum=0.0;
		
		for(int i=0; i<number; i++)
		{
			System.out.print(array[i] + " ");
			//calculating the sum of all elements in the array.
			sum+=array[i];
			
		}
		
		//Declaring and initializing the variable average for calculating of all elements in the array
		double average = sum/array.length;
		
		//Printing the average of all elements in the array.
		System.out.println("The Average of all elements in the Array: " +average);
		
		//Closing the scanner class object
		sc.close();
	}

}
