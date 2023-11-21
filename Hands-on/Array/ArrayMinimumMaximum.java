package array;
//Given an array of integers, write a Java program to find the maximum and minimum elements in the array.
import java.util.Scanner;
public class ArrayMinimumMaximum 
{
	public static void main(String[] args)
	{
		//scanner class to take input from user.
		Scanner sc = new Scanner(System.in);
		
		//get the size of the array from user
		System.out.println("Enter the number of elements: ");
		//integer input from user
		int number = sc.nextInt();
		
		//Declaring the Array
		int[] array = new int[number];
		System.out.println("Enter the " +number+" elements: ");

		//for loop to initialize the Array
	    for (int i = 0; i < number; i++)
	    {
	    	array[i] = sc.nextInt();
	    }
	    // Display the elements entered by the user
	    System.out.println("Elements in the Array:");

	    //Declaring and initializing the variable maximum and minimum
	    int maximum = array[0];
        int minimum = array[0];

        for (int i = 1; i < number; i++) 
        {
      	  //if condition to check number is greater than maximum
          if (array[i] > maximum) 
          {
              maximum = array[i];
          }

          //if condition to check number is less than than minimum
          if (array[i] < minimum) 
          {
              minimum = array[i];
          }
        }
        //Printing the Minimum and Maximum elements in an array
        System.out.println("Minimum Element in an Array: "+minimum);
        System.out.println("Maximum Element in an Array: "+maximum);
      
        //Closing the scanner class object
        sc.close();
	 }

}
