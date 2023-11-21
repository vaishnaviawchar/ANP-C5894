package collections;
//Stack example
import java.util.Stack;
public class StackExample 
{
	public static void main(String[] args) 
	{
		// Create a Stack to store strings
		Stack<String> stack = new Stack<>();
		
		//Pushing the elements onto the stack
		stack.push("java");
		stack.push("python");
		stack.push("C++");
		
		// Peeking at the top element (without removing it)
		System.out.println("Top element:" +stack.peek());
		
		// Popping elements from the stack
		System.out.println("Popped element: "+stack.pop());
		
		// Check if the stack is empty
		System.out.println("Is the stack empty?"+stack.isEmpty());
		
		// Pushing more elements
		stack.push("javascript");
		stack.push("C#");
		
		// Size of the stack
		System.out.println("Stack size: "+stack.size());
		
		// Pop elements until the stack is empty
		System.out.println("Elements popped from the stack: ");
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

	}

}
