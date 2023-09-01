package com.threads.sample;
//Implementing the class ThreadOne from Runnable
 class ThreadOne implements Runnable
{
	//Declaring a run method
	public void run()
	{
		//For loop to initialize value of i from 1 to 100.
		for(int i=1; i<=100; i++)
		{
			//getting the name of the current thread and value of i
			System.out.println(Thread.currentThread().getName() +" : "+ i);
	    }
	
    }
}
//Implementing the class ThreadTwo from Runnable
 class ThreadTwo implements Runnable
 {
	//Declaring a run method
 	public void run()
 	{
 		//For loop to initialize value of i from 100 to 200.
 		for(int i=101; i<=200; i++)
 		{
 			//getting the name of the current thread and value of i
 			System.out.println(Thread.currentThread().getName() +" : "+ i);
 		}
 	}
 }
 //Main method
 class ThreadOneMain
 {
	 public static void main(String[] args) throws InterruptedException 
	{
		//instantiating thread class that implements Runnable interface
		ThreadOne tone = new ThreadOne();
		//Creating an object to Thread class by passing thread as an argument
		Thread t = new Thread(tone);
		//setting the name of thread
		t.setName("Thread1");
		//Starting a thread
		t.start();
		t.sleep(500);  // blocked state
		t.stop();  // thread terminate/dead/ end
		System.out.println(t.isAlive());
		
		//instantiating thread class that implements Runnable interface
		ThreadTwo ttwo = new ThreadTwo();
		//Creating an object to Thread class by passing thread as an argument
		Thread t2 = new Thread(ttwo);
		//setting the name of thread
		t2.setName("Thread2");
		//Starting the thread
		t2.start();
		
	}

}
