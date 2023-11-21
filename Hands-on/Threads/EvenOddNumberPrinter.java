package com.threads.sample;
//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

//EvenNumberPrinter class implements the Runnable interface to print even numbers.
class EvenNumberPrinter implements Runnable 
{
	public void run() 
	{
		//for loop condition to prints even numbers from 2 to 20.
      for (int i = 2; i <= 20; i += 2) 
      {
      	// Print the current thread's name along with the even number.
          System.out.println(Thread.currentThread().getName() + " : " + "Even Number: " + i);
      }
  }
}

//OddNumberPrinter class implements the Runnable interface to print odd numbers.
class OddNumberPrinter implements Runnable 
{
	public void run() 
  {
		//For loop condition to prints odd numbers from 1 to 19.
		for (int i = 1; i <= 19; i += 2) 
      {
			// Print the current thread's name along with the odd number.
          System.out.println(Thread.currentThread().getName() + " : " + "Odd Number: " + i);
      }
  }
}

//Main class to create and run two threads for printing even and odd numbers.
class EvenOddNumberPrinter_Main 
{
	public static void main(String[] args) throws InterruptedException 
  {
		//Create and start the first thread for even numbers.
      Thread t1 = new Thread(new EvenNumberPrinter());
      //Setting the name for Thread
      t1.setName("Thread1");
      //Starting a thread
      t1.start();
      //Wait for t1 to finish before continuing
      t1.join(); 
   
      System.out.println(" "); 
   
      //Create and start the second thread for odd numbers.
      Thread t2 = new Thread(new OddNumberPrinter());
      //Setting the name for Thread
      t2.setName("Thread2");
      //Starting a thread
      t2.start();
  }
}