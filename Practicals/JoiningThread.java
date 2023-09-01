package com.threads.sample;

public class JoiningThread extends Thread
{
	public void run()
	{
		//for loop to initialize the value of i from 1 to 4
		for(int i =1; i<=4;i++)
		{
			try 
			{
				// Pause the thread for 1000 milliseconds (1 second)
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			// Print the current value of i
			System.out.println(i);
		}
    }
}
class JoiningThreadMain
{
	public static void main(String[] args)  
	{
		// Creating new instances of JoiningThread
		JoiningThread t1 = new JoiningThread();
		// Creating new instances of JoiningThread
		JoiningThread t2 = new JoiningThread();
		// Creating new instances of JoiningThread
		JoiningThread t3 = new JoiningThread();
		//Starting the thread t1
		t1.start();
		try 
		{
			// Wait for t1 to complete before proceeding
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		//Starting the thread t2
		t2.start();
		try 
		{
			// Wait for t2 to complete before proceeding
			t2.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		//Starting the thread t3
		t3.start();
	}

}
