package array;
//Find the sum & average of 2 matrix.
import java.util.Scanner;

public class SumAndAverageOfMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the row: ");
		int row=sc.nextInt();
		System.out.println("Enter the size of the column: ");
		int column=sc.nextInt();
		
		// Step 2: Create the multidimensional array based on user input size
	     int[][] arrays = new int[row][column];
		 // Step 3: Get elements for each cell of the array from the user
	     System.out.println("Enter elements for the array:");

	     for (int i = 0; i < row; i++) 
	     {
	    	 for (int j = 0; j < column; j++)
	    	 {
	    		 arrays[i][j] = sc.nextInt();
	         }
	     }

	     // Step 4: Optionally, display the array to verify the user input
	     System.out.println("the matrix is:");

	     for (int i = 0; i < row; i++) 
	     {
	         for (int j = 0; j < column; j++)
	         {
	             System.out.print(arrays[i][j] + " ");
	         }
	         System.out.println();
	     }
	     int sum = 0;
	     int average = 0;
	     for (int i = 0; i < row; i++) 
	     {
	    	 for (int j = 0; j < column; j++)
	    	 {
	    		 sum+=arrays[i][j];
	    		 average=sum/(row*column);
	    		 System.out.println(" ");
	    	 }
	     }
	     System.out.println("the sum of the matrix is: "+sum);
	     System.out.println("average of the matrix is: "+average);

	}

}
