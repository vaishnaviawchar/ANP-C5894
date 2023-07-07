package oops;
//Example of abstraction
abstract class Animals2 
{
	//abstract method of sound
	public abstract void sound();
	public void sleep()
	{
		System.out.println("Animals sleep...");
	}
}
//subclass inherits Animals2
class Monkey extends Animals2
{
	public void sound()
	{
		System.out.println("Monkey sounds like human...");
	}
}
class Animals2_Main
{
	public static void main(String[] args)
	{
		//creating instance of subclass
		Monkey m = new Monkey();
		//access fields and methods
		m.sound();
		m.sleep();
	}
}

