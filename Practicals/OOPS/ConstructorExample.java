package oops;
//person class that demonstrates constructor overloading
public class ConstructorExample 
{
	//fields or attributes
    private String name;
    private int age;
    
    // Default constructor - without parameter
	public ConstructorExample() 
	{
        name = "vaishnavi";
        age = 21;

	}
	
	// Constructor with name parameter
	public ConstructorExample(String name) 
	{
	
		this.name = name;
		this.age = 21;
	}
	
	// Constructor with name and age parameters
	public ConstructorExample(String name, int age) 
	{
		
		this.name = name;
		this.age = age;
	}
	
	// Getter methods for name and age
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}


	public static void main(String[] args) 
	{
		// Creating objects using different constructors
		// Default constructor
		ConstructorExample ConstructorExample1 = new ConstructorExample();
		// Constructor with name parameter
		ConstructorExample ConstructorExample2 = new ConstructorExample("pooja");
		// Constructor with name and age parameters
		ConstructorExample ConstructorExample3 = new ConstructorExample("raj", 40);
		
		// Getting information using getter methods
		System.out.println(ConstructorExample1.getName() + " is " + ConstructorExample1.getAge() + " years old.");
        System.out.println(ConstructorExample2.getName() + " is " + ConstructorExample2.getAge() + " years old.");
        System.out.println(ConstructorExample3.getName() + " is " + ConstructorExample3.getAge() + " years old.");
	}

}
