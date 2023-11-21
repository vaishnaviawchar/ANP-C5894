package exceptionhandling;
import java.util.Scanner;
public class NullPointerExceptionExample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string (or 'null' to trigger the exception): ");
		String input = sc.nextLine();
	
		
		try
		{ 
			int length = input.length();
			System.out.println("Length of the input string: "+length);
		}
		catch(NullPointerException e)
		{
			
			System.out.println("An exception occurred: "+e.getMessage());
		}
	}
}
		
	

