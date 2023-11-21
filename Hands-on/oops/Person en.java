package oops;

 class Person
{
	private String name;
	private int age;
	//get method of name
	public String getName() 
	{
		return name;
	}
	//set method of name
	public void setName(String name) 
	{
		this.name = name;
	}
	//get method of age
	public int getAge() 
	{
		return age;
	}
	//set method of age
	public void setAge(int age) {
		this.age = age;
	}
}
class PersonMain
{
	public static void main(String[] args)
	{
		//creating instance of class person
		Person p=new Person();
		//setting the value
		p.setName("Vaishnavi");
		p.setAge(20);
		//printing the values
		System.out.println("name is: " +p.getName());
		System.out.println("age is: " +p.getAge());
		}
}
