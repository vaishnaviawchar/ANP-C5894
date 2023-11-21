package oops;

abstract class Shape1 
{
	//abstract method of calculateArea
	public abstract void calculateArea();
	//abstract method Perimeter
	public abstract void Perimeter();
}
//subclass inherits from class Shape1
class Rectangle extends Shape1
{
	public void calculateArea()
	{
		System.out.println("Area of rectangle is: l*b");
		
	}
	public void Perimeter()
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
	public void Perimeter()
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
	public void Perimeter()
	{
		System.out.println("perimeter of triangle is: P = a + b + c");
	}
}
class Shape1_Main
{
	public static void main(String[] args)
	{
		//creating instance of subclass rectangle
		Rectangle r= new Rectangle();
		//access methods
		r.calculateArea();
		r.Perimeter();
		//creating instance of subclass Circle
		Circle c = new Circle();
		//access methods
		c.calculateArea();
		c.Perimeter();
		//creating instance of subclass Triangle
		Triangle t = new Triangle();
		//access methods
		t.calculateArea();
		t.Perimeter();
	}
}