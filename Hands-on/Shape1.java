package oops;

abstract class Shape1 
{
	public abstract void calculateArea();
	public abstract void perimeter();
}
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
		Rectangle r= new Rectangle();
		r.calculateArea();
		r.perimeter();
		
		Circle c = new Circle();
		c.calculateArea();
		c.perimeter();
		
		Triangle t = new Triangle();
		t.calculateArea();
		t.perimeter();
	}
}