package array;
//Array sort in ascending & descending order.


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArraySorting 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Step 1: Get the size of the array from the user
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		// Step 2: Get the elements of the array from the user
		int[] arr=new int [size];
		System.out.println("Enter" + size + "Elements:");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		// Step 3: Sort the array in ascending order
		Arrays.sort(arr);
		System.out.println("Array in ascending order: ");
		printArray(arr);
		
		// Step 4: Sort the array in descending order
		Integer[] arrWrapper = new Integer[size];
		// Wrapping in Integer to use 
		Collections.reverseOrder();
		for(int i=0; i<size; i++)
		{
			arrWrapper[i]=arr[i];
		}
		Arrays.sort(arrWrapper, Collections.reverseOrder());
        System.out.print("Array in descending order: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(arrWrapper[i] + " ");
        }

        sc.close();
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
		
		

	


