package oops;
//example of single inheritance
 class Shape 
{
	 //fields and methods 
	public void calculateArea()
	{
		System.out.println("calculating the area of the shape");

	}

}
 //inherits from shape
 class Rectangle extends Shape
 {
	 //fields and methods
	 public void calculateArea()
	 {
	 System.out.println("calculating area of rectangle");
 }
 }
 class shapeMain
 {
	 //creating object of subclass
	 public static void main(String[] args)
	 {
		 Rectangle r= new Rectangle();
		 r.calculateArea();
	 }
 }

