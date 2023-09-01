package operators;
/*Write a Java program that prompts the user to enter a three-digit number. 
 *The program should check if the number is a palindrome,
 *which means it reads the same forwards and backwards.*/
import java.util.Scanner;
public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three digit number: ");
		int number = sc.nextInt();
		int Firstdigit =number/100;
		int Thirddigit= number%10;
	      if( Firstdigit== Thirddigit)
			{
				System.out.println("The number is palindrome" +number);
			}
			else
			{
				System.out.println("The number is not palindrome " +number);
			}
		
		
	}

}
