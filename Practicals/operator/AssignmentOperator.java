package operators;
/*The user is prompted to enter the initial value,
increment value, and decrement value. 
These values are stored in the variables value, increment, 
and decrement, respectively.*/
import java.util.Scanner;
public class AssignmentOperator
{
	public static void main(String[] args) 
	{
		//input from the user
		Scanner sc = new Scanner(System.in);
		//input for the initial value
		System.out.println("Enter the initial value: ");
		int value=sc.nextInt();
		
		//input for the increment value
		System.out.println("Enter the increment value: ");
		int increment=sc.nextInt();
		
	    //input for the increment value
		System.out.println("Enter the decrement value :");
		int decrement=sc.nextInt();
		
	    // Equivalent to: value = value + increment;
		value+=increment;
		System.out.println("After increment:" +value);
		
	    // Equivalent to: value = value - decrement;
		value-=decrement;
		System.out.println("After decrement: "+value);
		sc.close();
	}

}
