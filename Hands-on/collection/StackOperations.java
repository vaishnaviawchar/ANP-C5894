package collections;
/*Stack Implementation
Implement a stack. Write a program that performs the following operations:
a) Push elements onto the stack.
b) Pop elements from the stack.
c) Check whether the stack is empty.
d) Display the elements in the stack.*/
import java.util.Stack;
public class StackOperations 
{
	public static void main(String[] args) 
	{
		//Creating Stack to store elements.
		Stack<String> stack = new Stack<>();
		
		//Pushing the elements onto the stack
		stack.push("Rose");
		stack.push("Jasmine");
		stack.push("Sunflower");
		stack.push("Lilly");
		
		//print the all element of the stack
		System.out.println("Elements of the Stack : "+stack);
		
		//Removing elements from the stack
		System.out.println("Removed element: "+stack.pop());
		
		//Checking whether the stack is empty
		System.out.println("Is the Stack empty? : "+stack.isEmpty());
		
		//Displaying the elements in the stack.
		System.out.println("The Current elements of the Stack: "+stack);
	
	}

}
