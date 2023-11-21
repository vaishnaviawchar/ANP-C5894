package string;
//program for reverse string using StringBuffer class.
import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String input = sc.nextLine();
		
		String reversed = reverseString(input);
		
		System.out.println("Reversed string: "+reversed);
		
		sc.close();

	}

	private static String reverseString(String str) 
	{
		StringBuffer reversed = new StringBuffer(str).reverse();
		return reversed.toString();
	}

}
