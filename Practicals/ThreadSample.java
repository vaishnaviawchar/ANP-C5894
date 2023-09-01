package com.threads.sample;

class ThreadSample extends Thread 
{
	public void run()
	{
		//For loop to initialize the value of i from 1 to 100
		for(int i=1; i<=100; i++)
		{
			//printing the value of i
			System.out.println("The value of i is: "+i);
		}
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		//For loop to initialize the value of i from 101 to 200
		for(int i=101; i<=200; i++)
		{
			//printing the value of i
			System.out.println("The value of i is: "+i);
		}
	}
}

class ThreadsMain
{
	public static void main(String[] args) 
	{
		//instantiating thread class that extends Runnable interface
		ThreadSample t1 = new ThreadSample();
		//Starting the thread
		t1.start();
		
		//instantiating thread class that extends Runnable interface
		Thread1 t2 = new Thread1();
		//Starting the thread
		t2.start();
	}

}

	
