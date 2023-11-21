package oops;
//example of encapsulation
 class Student1 {
	 private String Name;
	 private int Age;
	 private int Rollno;
	 private String Address;
	 //get method of name
	public String getName() {
		return Name;
	}
	//set method of name
	public void setName(String name) {
		Name = name;
	}
	//get method of age
	public int getAge() {
		return Age;
	}
	//set method of age
	public void setAge(int age) {
		Age = age;
	}
	//get method of Rollno
	public int getRollno() {
		return Rollno;
	}
	//set method of Rollno
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	//get method of address
	public String getAddress() {
		return Address;
	}
	//set method of address
	public void setAddress(String address) {
		Address = address;
	}
	 class Student1Main
	 {
		 //creating instance of encapsulation
		 public static void main(String[] args)
		 {
			 Student1 S= new Student1();
			//setting values
			 S.setName("sami");
			 S.setAddress("vashi new mumbai sec-30");
			 S.setAge(21);
			 S.setRollno(11);
			 //printing values
			 System.out.println("Name is:" + S.getName());
			 System.out.println("Age is:" + S.getAge());
			 System.out.println("Address is:" + S.getAddress());
			 System.out.println("Rollno is:" + S.getRollno());
			 
		 }
	 }
		 

	
}
