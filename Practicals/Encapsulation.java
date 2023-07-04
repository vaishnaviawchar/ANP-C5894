package oops;
//Example of Encapsulation
 class Encapsulation {
	private String name;
	private int age;
	
//get Name method
	public String getName() {
		return name;
	}

//set Name method
	public void setName(String name) {
		this.name = name;
	}

//get age method
	public int getAge() {
		return age;
	}

//set age method
	public void setAge(int age) {
		this.age = age;
	}


}
class Main
{
	//creating instance of Encapsulation
	public static void main(String[] args)
	{
	Encapsulation e=new Encapsulation();
	
	//setting values
	e.setName("vaishu");
	e.setAge(20);
	//print values
	System.out.println("name is:" + e.getName());
	System.out.println("age is:" + e.getAge());
	
}
}
