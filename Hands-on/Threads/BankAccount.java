package com.threads.sample;
//Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.

class BankAccount extends Thread 
{
  // Shared static variable to store the account balance.
	// Initial balance set to 1000
	static int balance = 1000; 

  // Thread's run method where withdrawal and deposit operations are performed.
  public void run() 
  {
      // Synchronize on the BankAccount class to ensure thread safety.
      synchronized (BankAccount.class) 
      {
          // Check if the balance is sufficient for withdrawal.
          if (balance >= 800) 
          {
              // Print a message indicating that withdrawal is possible.
              System.out.println(Thread.currentThread().getName() + ": your balance is " + balance + ". You can withdraw the amount");

              try 
              {
                  // Simulate some processing time with a sleep.
                  Thread.sleep(1000);
              } catch (InterruptedException e)
              {
                  e.printStackTrace();
              }
              
              // Perform the withdrawal and update the balance.
              balance -= 200;
              System.out.println(Thread.currentThread().getName() + " after withdrawal, your balance is " + balance);
          } 
          else 
          {
              // Print a message indicating that the balance is insufficient for withdrawal.
              System.out.println(Thread.currentThread().getName() + ": your balance is " + balance + ". You can't withdraw amount");
          }
          
          // Simulate a deposit operation if the balance is below a certain threshold.
          if (balance < 1000) 
          {
              int depositAmount = 300;
              balance += depositAmount;
              System.out.println(Thread.currentThread().getName() + " deposited " + depositAmount + ". New balance is " + balance);
          }
      }
  }
}

//Main class to demonstrate concurrent withdrawal and deposit operations.
class BankAccount_Main 
{
  public static void main(String[] args) {
      // Creating two instances of BankAccount representing account holders.
      BankAccount ac1 = new BankAccount();
      ac1.setName("Riya");
      BankAccount ac2 = new BankAccount();
      ac2.setName("Shruti");
      
      //Starting the threads for concurrent execution.
      ac1.start();
      ac2.start();
  }
}
