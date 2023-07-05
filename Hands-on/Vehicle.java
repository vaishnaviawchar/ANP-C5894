package oops;

class Vehicle {
   public String brand;
   public String year;
	public void displayinfo()
	{
		System.out.println("brand and year of the vehicle ");
		
	}
}

 class Car extends Vehicle
 {
	 public String model;
		{
			System.out.println(" brand and year of the vehicle  ");
			
		}
 }
 class Sportscar extends Car 
 {
	 int topspeed;
	 public void displayinfo()
		{
			System.out.println("brand,year,model and topspeed of the sportscar ");
			
		}
 }
 class  VehicleMain
 {
	
		public static void main(String[] args)
	{
			Sportscar s=new Sportscar();
			s.brand="ferrarri";
			s.model="s1";
			s.year="2023";
			s.topspeed=999;
			System.out.println("brand name is " +  s.brand);
			System.out.println("model is " +  s.model);
			System.out.println("year is " +  s.year);
			System.out.println("topspeed is"+ s.topspeed);
			}
	}
	 