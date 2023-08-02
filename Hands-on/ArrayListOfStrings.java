package collections;
/*.Create an ArrayList of strings add the following 
 *elements: "Apple", "Banana", "Orange", "Mango", "Grapes". Display the elements of the ArrayList.*/
import java.util.ArrayList;
import java.util.List;
public class ArrayListOfStrings 
{
	public static void main(String[] args) 
	{
		//create list of Strings
		List<String> ls = new ArrayList<>();
		
		//Adding the elements in an ArrayList
		ls.add("Apple");
		ls.add("Banana");
		ls.add("Orange");
		ls.add("Grapes");
		
		//Accessing elements in the list
		System.out.println("Elements of the ArrayList :" +ls);
	}

}
