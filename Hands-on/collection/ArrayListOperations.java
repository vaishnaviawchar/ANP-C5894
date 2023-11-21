package collections;
/*.Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.*/
import java.util.ArrayList;
import java.util.List;
public class ArrayListOperations 
{
	public static void main(String[] args) 
	{
		// Creating a Array list of integers
		List<Integer> number = new ArrayList<>();
		
		//Adding the elements to the ArrayList
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(30);
		
		//Accessing elements 
		System.out.println("Elements of the ArrayList :"+number);
		
		//Removing element from ArrayList
		number.remove(2);
		System.out.println("After removing an element at index 2: "+number);
		
		//Updating an element from ArrayList
		number.set(1, 20);
		System.out.println("Updated ArrayList: " +number);
		
	}

}
