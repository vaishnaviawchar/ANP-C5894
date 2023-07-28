package array;
/*Write a Java program to take an 15  array of integers as input from the user and 
 *sort it in ascending order using any suitable sorting algorithm. 
 *Display the sorted array.*/
import java.util.Arrays;
import java.util.Scanner;
public class ArraySortAscending 
{
	public static void main(String[] args) 
	{
		//scanner class to take input from user
		Scanner sc = new Scanner(System.in);

        // Step 1: Get the elements of the array from the user
        int size = 15;
        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements:");
        //for loop condition to initialized the array
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Step 2: Sort the array in ascending order
        Arrays.sort(arr);
        System.out.println("Array in ascending order: ");
        printArray(arr);

        // Close the scanner after use
        sc.close(); 
    }

    private static void printArray(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
	
}
