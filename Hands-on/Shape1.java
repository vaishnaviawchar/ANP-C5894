package oops;

abstract class Shape1 
{
	//abstract method of calculateArea
	public abstract void calculateArea();
	//abstract method of perimeter
	public abstract void perimeter();
}
//subclass inherits from class Shape1
class Rectangle extends Shape1
{
	public void calculateArea()
	{
		System.out.println("Area of rectangle is: l*b");
		
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle: 2(Length + Width)");
	}
}
//subclass inherits from class Shape1
class Circle extends Shape1
{
	public void calculateArea()
	{
		System.out.println("Area of circle is: πr2");
	}
	public void perimeter()
	{
		System.out.println("Perimeter of circle is: 2πr");
	}
}
//subclass inherits from class Shape1
class Triangle extends Shape1
{
	public void calculateArea()
	{
		System.out.println("Area of triangle is: A = ½ (b × h)");
	}
	public void perimeter()
	{
		System.out.println("perimeter of triangle is: P = a + b + c");
	}
}
class Shape1_Main
{
	public static void main(String[] args)
	{
		//creating instance of sublclass rectangle
		Rectangle r= new Rectangle();
		//acceessing methods
		r.calculateArea();
		r.perimeter();
		//creating instance of sublclass Circle
		Circle c = new Circle();
		//acceessing methods
		c.calculateArea();
		c.perimeter();
		//creating instance of sublclass Triangle
		Triangle t = new Triangle();
		//acceessing methods
		t.calculateArea();
		t.perimeter();
	}
}
