package loops;
//Program to print reverse of a number
public class ReverseNumber 
{
	public static void main(String[] args) 
	{
	
		//initializing number
		int number = 67890;
	    //reversenumber initialized to 0
		int reversenumber = 0;
		//condition to check number is not equal to 0
		while(number!=0)
		{
			int remainder = number % 10;
			reversenumber = reversenumber * 10 + remainder;
			number /= 10;
		}
		 //print reverse number
		System.out.println("ReverNumber: " +reversenumber);
	}

}
