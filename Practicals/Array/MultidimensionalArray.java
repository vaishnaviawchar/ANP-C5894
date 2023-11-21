package array;
import java.util.Scanner;
public class MultidimensionalArray 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	     // Step 1: Get the dimensions of the array from the user
	     System.out.print("Enter the number of rows: ");
	     int rows = sc.nextInt();
	     System.out.print("Enter the number of columns: ");
	     int columns = sc.nextInt();

	     // Step 2: Create the multidimensional array based on user input size
	     int[][] arr = new int[rows][columns];

	     // Step 3: Get elements for each cell of the array from the user
	     System.out.println("Enter elements for the array:");

	     for (int i = 0; i < rows; i++) 
	     {
	    	 for (int j = 0; j < columns; j++)
	    	 {
	    		 arr[i][j] = sc.nextInt();
	         }
	     }

	     // Step 4: Optionally, display the array to verify the user input
	     System.out.println("Multidimensional array:");

	     for (int i = 0; i < rows; i++) 
	     {
	         for (int j = 0; j < columns; j++)
	         {
	             System.out.print(arr[i][j] + " ");
	         }
	         System.out.println();
	     }

	     sc.close();
	}

}


