package oops;
/*Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". 
 *Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and implement the abstract methods.
 *Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle.*/
abstract class Vehicle 
{
	//Declaring abstract method start and stop
	public abstract void start();
	public abstract void stop();
}

//subclass car inherits class vehicle
class Car extends Vehicle
{
	public void start()
	{
		//Prints car starts
		System.out.println("Car starts");
	}
	public void stop()
	{
		//Prints car stops
		System.out.println("Car stops");
	}
}

//subclass Motorcycle inherits class vehicle
class Motorcycle extends Vehicle
{
	public void start()
	{
		//Prints Motorcycle starts
		System.out.println("Motorcycle starts");
		
	}
	public void stop()
	{
		//Prints Motorcycle stops
		System.out.println("Motorcycle stops");
		
	}
}

//creating class VehicleMain
class VehicleMain
{
	public static void main(String[] args) 
	{
		//Creating instance of class car
	    Car car = new Car();
	    System.out.println("Starting and Stopping operations for Car: ");
	    
	    //Accessing methods
	    car.start();
		car.stop();
		System.out.println("");
		
		//Creating instance of class Motorcycle
		Motorcycle motorcycle = new Motorcycle();
		System.out.println("Starting and Stopping operations for a MotorCycle: ");
		
		//Accessing methods
		motorcycle.start();
		motorcycle.stop();
		
	}

}
