package collections;
import java.util.Vector;
public class VectorExample 
{
	public static void main(String[] args) 
	{
		// Create a Vector to store integers
		Vector<Integer> vector = new Vector<>();
		
		// Adding elements to the Vector
		vector.add(10);
		vector.add(20);
		vector.add(30);
		
		//Accessing elements
		System.out.println("First element: " +vector.get(0));
		System.out.println("Second element: " +vector.get(1));
		System.out.println("Third Element: " +vector.get(2));
		
		//size of Vector
		System.out.println("Vector size: " +vector.size());
		
		//Check if the vector is empty
		System.out.println("Is the vector empty? " +vector.isEmpty());
		
		//Iterating over the Vector elements using a for loop
		System.out.println("Vector elements: ");
		for(int i=0; i<vector.size(); i++)
		{
			System.out.println(vector.get(i));
		}
		
		// Removing an element from the Vector
		vector.remove(1);
		System.out.println("After removing the second element: " +vector);
		
		//clearing the vector
		vector.clear();
		System.out.println("After clearing the vector " +vector);
		
	}

}
