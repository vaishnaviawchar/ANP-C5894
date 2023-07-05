package oops;
//example of single level inheritance
//super class or base class or parent class
 class Animal 
{
	String name;
	public void eat ()
	{
		System.out.println("Animal eat");
	}
}
//inherits from animal 
 class Dog extends Animal
 {
	 //fields and method of animal class
	 //fields and method of dog class
	 public void sound()
	 {
		 System.out.println("Dog barks");
	 }
 }
 class AnimalMain
 {
	 public static void main(String[] args)
	 {
		 //creating objects of subclass
		 Dog d = new Dog();
		 //access fields and methods
		 d.name="soni";
		 System.out.println(d.name="moti");
		 d.eat();
		 d.sound();
	 }
 }
