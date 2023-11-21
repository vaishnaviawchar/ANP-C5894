package collections;
/*HashSet Operations
Create a program that showcases the usage of a HashSet:
a) Add elements to the set.
b) Check whether a specific element exists in the set.
c) Remove an element from the set.
d) Print the elements of the set.*/
import java.util.*;
public class HashSetOperations 
{
	public static void main(String[] args) 
	{
		//Creating HashSet to store elements.
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//Add elements to the set.
		hs.add(22);
		hs.add(3);
		hs.add(50);
		hs.add(6);
		
		int e=3;
		//Check whether a specific element exists in the set.
		System.out.println("Element contains: "+hs.contains(e));
		
		//Remove an element from the set
		hs.remove(e);
		System.out.println("After Removing the element: "+hs);
	
		//Print the elements of the set
		System.out.println("Elements of the HashSet arr:"+hs);

	}

}
