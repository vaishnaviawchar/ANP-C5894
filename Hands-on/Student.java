package oops;

class Student {
private String name;
private int age;
private int rollno;
private String address;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

	class studentMain
	{
		public static void main(String[] args)
		{
			Student s = new Student();
			s.setAddress("vashi new mumbai sector 30 ");
			s.setAge(21);
			s.setName("vaishnavi awchar");
			s.setRollno(123);
			
			System.out.println("name is:" + s.getName()); 
			System.out.println("Rollno is:" + s.getRollno());
			System.out.println("age is:" + s.getAge());
			System.out.println("Address is:" + s.getAddress());
		}
	}
}
