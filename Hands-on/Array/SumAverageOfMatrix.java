package array;
//Find the sum & average of 2 matrix.
import java.util.Scanner;

public class SumAverageOfMatrix 
{
	public static void main(String[] args) 
	{
		//Get the dimensions of the array from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the row: ");
		int row=sc.nextInt();
		System.out.println("Enter the size of the column: ");
		int column = sc.nextInt();
				
		//Create the multidimensional array for matrix1 based on user input size
		int[][] matrix1=new int[row][column];
		System.out.println("Enter elements for the matrix1:");
		
		//Get elements for each cell of the array from the user
	    for (int i = 0; i < row; i++) 
	    {
	    	for (int j = 0; j < column; j++)
	    	{
	    		matrix1[i][j] = sc.nextInt();
			}
        }
	    //display the matrix1 to verify the user input
	    System.out.println("First matrix is: ");
	       for (int i = 0; i < row; i++) 
		     {
		         for (int j = 0; j < column; j++)
		         {
		             System.out.print(matrix1[i][j] + " ");
		         }
		         System.out.println();
		     }
			     
       //Create the multidimensional array for matrix2 based on user input size
       int[][] matrix2=new int[row][column];
       System.out.println("Enter elements for the matrix2:");
      
       //Get elements for each cell of the array from the user
       for (int i = 0; i < row; i++) 
       {
    	   for (int j = 0; j < column; j++)
    	   {
    		   matrix2[i][j] = sc.nextInt();
		   }
	   }
      
      //display the matrix2 to verify the user input
      System.out.println("second matr,ix is: ");
       for (int i = 0; i < row; i++) 
	     {
	         for (int j = 0; j < column; j++)
	         {
	             System.out.print(matrix2[i][j] + " ");
	         }
	         System.out.println();
	     }

       
       //calculating the sum and average of both the of matrices
       int sum=0;
       int totalelement=column*row;
       int[][] sumofmatrix = new int[row][column];
	   for (int i = 0; i < row; i++)
	   {
		   for (int j = 0; j < column; j++)
		   {
			   //calculating the sum of matrix
			   sumofmatrix[i][j]= matrix1[i][j] + matrix2[i][j];
			   sum+=sumofmatrix[i][j];
		   }
	   }
	   //calculating the average of matrix
	   double average = sum/totalelement;
	   System.out.println("The sum of both matrices is: " +sum);
	   System.out.println("The average of both  matrices is: " +average);
	   sc.close();
	}

}


