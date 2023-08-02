package collections;
/*Create a method to find the sum of all the elements in an ArrayList of integers.
 *Test your method with a sample ArrayList*/
import java.util.ArrayList;
import java.util.List;
public class SumOfElements 
{
	public static void main(String[] args) 
	{
		//creating ArrayList of integers
		List<Integer> number = new ArrayList<>();
		
		//Adding elements in the ArrayList
		number.add(22);
		number.add(8);
		number.add(55);
		
		//declaring and Initializing variable sum to 0
		int sum=0;
		
		//For loop condition to iterate and calculate the sum of all elements in an ArrayList
		for(int i=0;  i < number.size(); i++)
		{
			//Calculating sum of elements
			sum+= number.get(i);
		}
		System.out.println("Sum of all elements in an ArrayList is: " + sum);
    }
}


