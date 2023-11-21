package oops;
//example of multilevel  inheritance
// parent class/ supper class/ base class
 class Animal1 
 {
	 //fields and methods
	public String name; 
	public void eat()
	{
		System.out.println("animal eat ");
		
	}
}
 //inherit from animals
class Doggy extends Animal1
{
	//fields and method of animal class
	//fields and method of doggy class
	
	public void sound()
	{
		System.out.println("dogs bark");
	}
}
class Puppy extends Doggy
{
	// fields and method of animal class
	//fields and method of doggy class 
	//fields and method of puppy class
	public void colour()
	{
		System.out.println("white and cream");
	}
}
class Animal1Main 
{
	public static void main(String[] args)
	{
		// creating object of sub class
		
         Puppy p=new Puppy();
         //access fields and method
         System.out.println("name soni");
         p.name="soni";
         p.eat();
         p.sound();
         p.colour();
	}
}
