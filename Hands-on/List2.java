package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class List2 
{
	public static void main(String[] args) 
	{
		 // Create a linked list of strings
		 LinkedList<String> Is = new LinkedList<>();
		 
		 // Adding elements to the linked list
		 Is.add("Apple");
		 Is.add("Banana");
		 Is.add("Orange");
		 Is.add("Mango");
		 
		// Accessing elements in the linked list
		 System.out.println("LinkrdList: " +Is);
		 
		//getting the first element
		 String firstElement = Is.getFirst();
		 System.out.println("First Element : " +firstElement);
		 
		//getting the last element
		 String lastElement = Is.getLast();
		 System.out.println("Last Element: " +lastElement);
		 
		// Updating elements in the linked list
		 Is.set(1, "Grapes");
		 System.out.println("Updated Linked list: " +Is);
		 
		// Removing elements from the linked list
		 Is.remove(3);
		 System.out.println("Linked List after removing element at index 3: " + Is);

        boolean contains = Is.contains("Orange");
        System.out.println("Contains Orange? " + contains); // Output: false (since we removed Orange)

        // Finding the index of an element
        int indexOfElement = Is.indexOf("Grapes");
        System.out.println("Index of Grapes: " + indexOfElement); // Output: 1

        // Size of the linked list
        int size = Is.size();
        System.out.println("Size of the linked list: " + size);
	        
        // Clear the linked list
        Is.clear();
        System.out.println("Linked List after clearing: " + Is);
       
        // Check if the linked list is empty
        boolean isEmpty = Is.isEmpty();
        System.out.println("Is linked list empty? " + isEmpty);
		 
	}

}
