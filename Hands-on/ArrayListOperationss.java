package collections;
/*ArrayList Operations
Write a Java program that demonstrates the following operations using an ArrayList:
a) Adding elements to the list.
b) Removing an element from the list.
c) Updating an element in the list.
d) Displaying the contents of the list.*/

import java.util.List;
import java.util.ArrayList;
public class ArrayListOperationss 
{
	public static void main(String[] args) 
	{
		//Creating an ArrayList to store elements.
		List<Integer> li = new ArrayList<>();
		
		//Adding elements to the list.
		li.add(12);
		li.add(4);
		li.add(5);
		li.add(33);
		li.add(9);
		
		//Removing an element from the list.
		li.remove(1);
		System.out.println("After Removing an element at index 1: "+li);
		
		//Updating an element in the list.
		li.set(3, 22);
		System.out.println("Updated ArrayList is: "+li);
		
		//Displaying the contents of the list
		System.out.println("The Elements of the ArrayList: "+li);
		
	}

}
