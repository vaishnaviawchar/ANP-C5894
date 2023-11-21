package com.thread.demo;

// implements Thread
class ThreadOne implements Runnable
{

	@Override
	public void run() {
		
		for(int i=0; i<=100; i++)
		{
			System.out.println("i value is" +i);
		}
	}
	
}

class ThreadTwo implements Runnable
{

	@Override
	public void run() {
		for(int i=101; i<=200; i++)
		{
			System.out.println("i value is" +i);
		}
	}
	
}

public class ThreadInJavaInterface {

	public static void main(String[] args) {
		ThreadOne tone=new ThreadOne();
		Thread t1=new Thread(tone);
		t1.start();
		
		ThreadTwo ttwo=new ThreadTwo();
		Thread t2=new Thread(ttwo);
		t2.start();
		System.out.println("ye main task hai");
		
		
		

	}

}
