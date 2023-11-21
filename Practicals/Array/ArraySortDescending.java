package array;
//Array to print the elements in descending order without reverseOrder().

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortDescending 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 // Get the size of the array from the user
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		// Get the elements of the array from the user
        // Using Integer wrapper class for sorting
		Integer[] arr = new Integer[size];
		System.out.println("Enter" + size + "elements: ");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		// Sort the array in descending order using custom comparator
		Arrays.sort(arr,(a,b)-> b.compareTo(a));
		// Print the sorted array
		System.out.print("Array in descending order: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
	}

}
