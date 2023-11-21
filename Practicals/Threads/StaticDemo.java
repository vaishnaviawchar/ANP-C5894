package com.thread.demo;

public class StaticDemo {
	
	//local varibale
	//instance variable
	//static variable
	
	//int a;    // class variable// instance varible
	static int a=0;  //static variable
	public void increment()
	{
		//int a=0;   //local variable
		a++;  
		System.out.println(a);  //print 1, 2, 3, 4 
	}
	public static void main(String[] args) {
		
		StaticDemo sd1=new StaticDemo();
		sd1.increment();
		StaticDemo sd2=new StaticDemo();
		sd2.increment();
		StaticDemo sd3=new StaticDemo();
		sd3.increment();
		StaticDemo sd4=new StaticDemo();
		sd4.increment();
		
	}

}
