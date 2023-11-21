package loops;
import java.util.*;
public class RightAngleTriangle 
{
	public static void main(String[] args) 
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows=c.nextInt();
		
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
		c.close();		
	
	}

}
