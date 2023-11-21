package com.String.sample;
import java.util.Scanner;
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = sc.nextLine();
		
		// Remove spaces and convert to lowercase
        String cleanInput = string.replaceAll("\\s+", "").toLowerCase();
        
        // Check if the cleaned string is a palindrome using recursion
        boolean isPalindrome = checkPalindrome(cleanInput);

	}

	private static boolean checkPalindrome(String cleanInput) {
		// TODO Auto-generated method stub
		return false;
	}

}
