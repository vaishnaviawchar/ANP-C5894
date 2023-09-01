package string;
//program to remove string duplicates
import java.util.Scanner;
public class DuplicateString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//input for the string
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		//calling removeDuplicates methods
		String a = removeDuplicates(input);
		
		System.out.println("String without duplicates: "+a);
		sc.close();
	}

	private static String removeDuplicates(String str) 
	{
		StringBuffer result = new StringBuffer();
		 // ASCII character range
		boolean[] seen = new boolean[256];
		
		for(int i=0; i<str.length(); i++)
		{
			char currentChar = str.charAt(i);
			if(!seen[currentChar])
			{
				result.append(currentChar);
				seen[currentChar] = true;
			}
		}
		return result.toString();
	}

}
