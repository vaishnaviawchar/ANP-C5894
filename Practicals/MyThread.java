package com.threads.sample;
//Extending class MyThread from class Thread
 class MyThread extends Thread
{
	 public void run()
	 {
		 System.out.println("Some task here");
	 }
	 
}
 
 class MyThreadmain
 {
	 public static void main(String[] args) 
	 {
		 //Creating instance of class MyThread
		 MyThread t = new MyThread();
		 //Accessing the start method
		 t.start();
		 //Setting the name for thread
		 t.setName("MyThread");
		 //Getting the name of thread
		 System.out.println(t.getName());
	}

}
