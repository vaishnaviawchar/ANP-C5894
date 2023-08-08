package collections;
/*Queue Operations
Design a program that demonstrates the use of a Queue:
a) Enqueue elements into the queue.
b) Dequeue elements from the queue.
c) Check whether the queue is empty.
d) Print the elements in the queue.*/
import java.util.Queue;
import java.util.LinkedList;
public class QueueOperations 
{
	public static void main(String[] args) 
	{
		//Creating Queue to store elements.
		Queue<Integer> queue = new LinkedList<>();
		
		//Enqueue elements into the queue
		queue.add(2);
		queue.add(4);
		queue.add(7);
		
		System.out.println("Elements of the Queue: "+queue);
		
		//Dequeue elements from the queue
		int r= queue.remove();
		System.out.println("Removed Element is: "+r);
		
		//Check whether the queue is empty
		System.out.println("Is the Queue empty? : "+queue.isEmpty());
		
		//Print the elements in the queue.
		System.out.println("Elements of the Queue: "+queue);
		
	}

}
