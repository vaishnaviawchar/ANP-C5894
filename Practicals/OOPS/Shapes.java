package oops;
/*Create a superclass called "Shape" with properties like "numSides" and "color".
 *Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape"
 *and have additional properties like "sideLengths" for triangle and square, and "radius" for the circle.
 *Write a Java program to display the details of a triangle, a square, and a circle.*/
class Shapes 
{
	//Declaring variable numSides and Color
	int numSides;
	String color;
}

//creating subclass of class Triangles
class Triangles extends Shapes
{
	//Declaring variable sideLength
	int sideLength;
}

//creating subclass of class Squares
class Squares extends Shapes
{
	//Declaring variable sideLength
    int sideLength;
}

//creating subclass of class Circles
class Circles extends Shapes
{
	//Declaring variable radius 
	int radius;
}
//creating main class
class ShapeDetails
{
	public static void main(String[] args) 
	{
		//creating instance of class Triangle
		Triangles triangle = new Triangles();
		
		//setting the values
		triangle.numSides=3;
		triangle.color="Red";
		triangle.sideLength=7;
		
		//printing the details of Triangle
		System.out.println("Triangle Details: ");
		System.out.println("Number of sides : " +triangle.numSides);
		System.out.println("Color : " +triangle.color);
		System.out.println("Side Length : " +triangle.sideLength);
		System.out.println("");
		
		//creating instance of class Square
		Squares square = new Squares();
		
		//setting the values
		square.numSides=4;
		square.color="Blue";
		square.sideLength=4;
		
		//printing the details of Square
		System.out.println("Square Details: ");
		System.out.println("Number of sides : " +square.numSides);
		System.out.println("Color : " +square.color);
		System.out.println("Side Length: " +square.sideLength);
		System.out.println("");
		
		//creating instance of class Circle
		Circles circle = new Circles();
		
		//setting the values
		circle.numSides=0;
		circle.color="Yellow";
		circle.radius=7;
		
		//printing the details of Circle
		System.out.println("Circle Details: ");
		System.out.println("Number of sides : " +circle.numSides);
		System.out.println("Color : " +circle.color);
		System.out.println("Side Length: " +circle.radius);
		
	}

}
