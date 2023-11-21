package collections;
import java.util.ArrayList;
import java.util.List;
public class ListExample 
{
	public static void main(String[] args) 
	{
		//create list of integers
	    List<Integer> num= new ArrayList<>();
					
		//Adding elements to the list
		num.add(12);
		num.add(23);
		num.add(24);
		num.add(33);
			
		//Accesing elements in the list
		System.out.println("List :" +num);
			
		//updating elements in the list
        num.set(2,44);
        System.out.println("Updated list : " +num);
	        
        //removing the elements in the list
        num.remove(3);
        System.out.println("After removing the elements at index 3:" +num);
	        
        //getting the value at index 0
        int firstElement = num.get(0);
        System.out.println("Firts element :" +firstElement);
	        
        //To check specific number
        boolean contains = num.contains(22);
        System.out.println("Contains 22? :" +contains);
	        
        //Finding the index of an elements
        int indexOfElement = num.indexOf(44);
        System.out.println("Index of 44: " +indexOfElement);
	        
        //size of the list
        int size = num.size();
        System.out.println("Size of the list :" + size);
	        
        //clear the list
        num.clear();
        System.out.println("List after clearing :" +num);
	        
        //check if the list is empty
        boolean isEmpty = num.isEmpty();
        System.out.println("Is List Empty? : " +isEmpty);
			
	}

}


