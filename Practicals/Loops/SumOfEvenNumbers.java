package loops;
import java.util.Scanner;
public class SumOfEvenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the series of the integer: ");
        int count = sc.nextInt();
        int sum=0;
        int number;
        for (int i = 0; i < count; i++) 
        {
          System.out.println("Enter the number:");
           number=sc.nextInt();
            if (number % 2 == 0)
            {
                sum += number;
            }
            if( number < 0)
            {
            	continue;
            }
            
        }

        System.out.println("Sum of all even numbers: " + sum);
    }
}