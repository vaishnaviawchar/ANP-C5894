package oops;
//Define interface
interface Animalsss 
{
	// Abstract method signatures (no implementation)
	void makeSound();
	void eat();

}
//Implement the interface in a class

class Dogss implements Animalsss
{
	public void makeSound()
	{
		System.out.println("Dog barks");
	}
	public void eat()
	{
		System.out.println("Dog eats bones");
	}
}
class Cat implements Animalsss
{
	public void makeSound()
	{
		System.out.println("cat mewos");
	}
	public void eat()
	{
		System.out.println("cat eat fishes");
	}
}
class interfaceExample
{
	public static void main(String[] args)
	{
		Animalsss dogss = new Dogss();
		Animalsss cat = new Cat();
		
		dogss.makeSound();// Output: Dog barks
		dogss.eat();// Output: Dog eats bones

		cat.makeSound(); // Output: Cat meows
	    cat.eat();  // Output: Cat eats fish
		
	}
}
