package oops;

class Vehicle 
{
	//fields and methods
   	public String brand;
  	public String year;
	public void displayinfo()
	{
		System.out.println("brand and year of the vehicle ");
		
	}
}
//inherits from class vehicle
 class Car extends Vehicle
 {
	 public String model;
		{
			System.out.println(" brand and year of the vehicle  ");
			
		}
 }
 class Sportscar extends Car 
 {
	 String topspeed;
	 public void displayinfo()
		{
			System.out.println("brand,year,model and topspeed of the sportscar ");
			
		}
 }
 class  VehicleMain
 {
	
		public static void main(String[] args)
	{
		//creating object of subclass
	 	Sportscar s=new Sportscar();
		
		//access fields and methods
		s.brand="Ferrari";
		System.out.println("brand name is: " + s.brand);
		s.year=2023;
		System.out.println("year is: " +s.year);
		s.model="488 GTB";
		System.out.println("model name is: " + s.model);
		s.topspeeed="205 mph";
		System.out.println("topspeed is: " + s.topspeeed);
	}
 }
	 
