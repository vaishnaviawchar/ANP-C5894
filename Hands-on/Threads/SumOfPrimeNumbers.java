package com.threads.sample;
import java.util.Scanner; 
class Threadprime extends Thread 
{
    int sum = 0;
    int limit;
    Scanner sc = new Scanner(System.in);

    public void run() 
    {
        System.out.println("Enter a limit for prime numbers: ");
        limit = sc.nextInt();

        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                sum += number;
            }
        }

        System.out.println("The Sum of Prime Numbers is: " + sum);
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
class SumOfPrimeNumbers 
{
	public static void main(String[] args) 
	{
		  Threadprime t = new Threadprime();
	        t.start();

	}

}
