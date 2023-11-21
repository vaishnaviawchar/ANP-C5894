package com.thread.demo;

public class JoiningThreadDemo extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		JoiningThreadDemo t1=new JoiningThreadDemo();
		JoiningThreadDemo t2=new JoiningThreadDemo();
		JoiningThreadDemo t3=new JoiningThreadDemo();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();

	}

}
