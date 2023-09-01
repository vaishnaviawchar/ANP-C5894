package collections;
//Queue Example
import java.util.Queue;
import java.util.LinkedList;

class QueueExample 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<>();
		
		//add elements 
		for(int i=0; i<5; i++)
		{
			q.add(i);
		}
		
		//display the elements of the queue
		System.out.println("Elements of queue: "+q);
		
		//to remove the head of queue
		int r =q.remove();
		System.out.println("Removed Element is: "+r);
		
		//to view the head element of queue
		int h =q.peek();
		System.out.println("Head of queue: "+h);
		
		//size of queue
		int s =q.size();
		System.out.println("Size of queue: "+s);
	}

}
