package oops;

 class Animals 
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
 //inherits from class Animals
 class Dogs extends Animals
 {
	 private String breed;
    //get method of breed
	public String getBreed() 
	{
		return breed;
	}
	//set method of breed
    public void setBreed(String breed) 
    {
		this.breed = breed;
	}
 }
 class Animals_Main
 {
	 public static void main(String[] args)
	 { 
		 //creating instance of subclass 
		 Dogs d = new Dogs();
		 
		 //setting the values
		 d.setName("charlie");
		 d.setAge(7);
		 d.setBreed("siberian husky");
		 
		 //printing the values
		 System.out.println("Name is: " + d.getName());
		 System.out.println("Age is: " + d.getAge());
		 System.out.println("Breed is: " + d.getBreed());
	 
	 }
 }
