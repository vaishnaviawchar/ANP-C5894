package com.threads.sample;

 class ThreadInJava implements Runnable
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

class Thread2 implements Runnable
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
class ThreadInJavaMain
{

	public static void main(String[] args) 
	{
		//instantiating thread class that implements Runnable interface
		ThreadInJava t1 = new ThreadInJava();
		//Creating an object to Thread class by passing thread as an argument
		Thread t = new Thread(t1);
		//Starting the thread
		t.start();
		
		//instantiating thread class that implements Runnable interface
		Thread2 tone = new Thread2();
		//Creating an object to Thread class by passing thread as an argument
		Thread t2 = new Thread(tone);
		//Starting the thread
		t2.start();
		

	}
}


