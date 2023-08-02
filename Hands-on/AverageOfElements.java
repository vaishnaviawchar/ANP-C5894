package collections;
/*Create a method to find the average of all the elements in a LinkedList of integers.
 *Test your method with a sample LinkedList.*/
import java.util.LinkedList;
public class AverageOfElements 
{
	public static void main(String[] args) 
	{
		//create LinkedList of integers
		LinkedList<Integer> numbers = new LinkedList<>();
		
		//Adding the elements in the LinkedList
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		
		//declaring and Initializing variable sum to 0
		int sum=0;
		
		//For loop condition to iterate and calculate the sum of all elements in an LinkedList
		for(int i=0 ; i<numbers.size(); i++)
		{
			//Calculating sum of elements
			sum+=numbers.get(i);
		}
		//Calculating Average of all elements in the LinkedList
		int average=sum/numbers.size();
		System.out.println("Average of all elements in the LinkedList of: " + average);

	}

}
