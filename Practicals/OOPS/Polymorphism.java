package oops;
//Example of Polymorphism
//Method overloading
public class Polymorphism 
{
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int sub(int a, int b, int c)
	{
		return a-b-c;
	}
	public double sub(double a, double b)
	{
		return a-b;
	}
	public int mul(int a)
	{
		return a*a;
	}
	public int mul(int a, int b, int c)
	{
		return a*b*c;
	}
}
class Polymorphism_Main
{
	public static void main(String[] args)
	{
		//creating instance of class
		Polymorphism p = new Polymorphism();
		//setting and printing the values
		System.out.println("The Substraction is: " +p.sub(100, 79));
		System.out.println("The Substraction is: " +p.sub(99, 85, 40));
		System.out.println("The Substraction is: " +p.sub(97.5, 79.2));
		System.out.println("The Substraction is: " +p.mul(22));
		System.out.println("The Substraction is: " +p.mul(33, 66, 21));
	}
}

