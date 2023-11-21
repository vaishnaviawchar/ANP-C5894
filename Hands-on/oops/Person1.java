package oops;

class Person1 
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
	public void setAge(int age) 
	{
		this.age = age;
	}
}
//inherits from class Person1
class Employee extends Person1
{
	private Double salary;
	//get method of salary
	public Double getSalary() 
	{
		return salary;
	}
	//set method of salary
	public void setSalary(Double salary) 
	{
		this.salary = salary;
	}
}
class Manager extends Employee
{
	private String department;
    //get method of department
	public String getDepartment() 
	{
		return department;
	}
    //set method of department
	public void setDepartment(String department) {
		this.department = department;
	}
}
class Person1_Main
{
	public static void main(String[] args)
	{
		//creating instance of subclass manager
		Manager m = new Manager();
		
		//setting the values
		m.setName("shruti");
		m.setAge(28);
		m.setSalary(50000.0);
		m.setDepartment("IT");
		
		//printing the values
		System.out.println("Name is: " +m.getName());
		System.out.println("Age is: " +m.getAge());
		System.out.println("Salary is: " +m.getSalary());
		System.out.println("Department is: " +m.getDepartment());
	}
}

