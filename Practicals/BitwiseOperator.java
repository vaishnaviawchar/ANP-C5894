package operators;
//Bitwise operation example
import java.util.Scanner;
public class BitwiseOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int number2 = sc.nextInt();
		
		//Bitwise AND 
		int bitwiseAndResult = number1 & number2;
        System.out.println("Bitwise AND Result: " + bitwiseAndResult);
		
        //BitwiseOR
        int bitwiseOrResult = number1 | number2;
        System.out.println("Bitwise OR Result: " + bitwiseOrResult);
		
        //Bitwise XOR Result
        int bitwiseXorResult = number1 ^ number2;
        System.out.println("Bitwise XOR Result: " + bitwiseXorResult);
		
        //bitwise Complement(Unary NOT)
        int bitwiseComplementResult1 = ~number1;
        System.out.println("Bitwise Complement of first integer: " + bitwiseComplementResult1);

        int bitwiseComplementResult2 = ~number2;
        System.out.println("Bitwise Complement of second integer: " + bitwiseComplementResult2);

	}

}
