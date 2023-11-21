package com.thread.demo;
class MyThread extends Thread
{
    @Override
    public void run() // running state
    {
        System.out.println("yahape task implement hoga");
    }
}
 
public class ThreadsInJava
{
    public static void main(String[] args)
    {
        MyThread thread = new MyThread();     //Creating a thread // new state
 
        thread.start();                     //Starting a thread // runnable state
        
        //System.out.println(thread.getName());// Thread-0 default name of thread
        
 
     thread.setName("Padmaja");        //Giving a name to the thread
 
        
		
		 String name = thread.getName(); //Retreiveing the name of the thread
		 
		 System.out.println(name); //Output : My Thread
		 
		 System.out.println(thread.getState());
		  }
}

