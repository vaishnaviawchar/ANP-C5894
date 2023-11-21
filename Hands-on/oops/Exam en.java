package oops;
//example of encapsulation
 class Exam {
private String Name;	 
private String Standard;
private int marks;
private char grade;
//get method of name
public String getName() {
	return Name;
}
//set method of name
public void setName(String name) {
	Name = name;
}
//get method of standard
public String getStandard() {
	return Standard;
}
//set method of standard
public void setStandard(String Standard) {
	this.Standard = Standard;
}
//get method of marks
public int getMarks() {
	return marks;
}
//set method of marks
public void setMarks(int marks) {
	this.marks = marks;
}
//get method of grades
public char getGrade() {
	return grade;
}
//set method of grade
public void setGrade(char grade) {
	this.grade = grade;
}
class ExamMain
{
	//creating instance of encapsulation
	public static void main(String[] args)
	{
		Exam e = new Exam();
		//setting values
		e.setName("ashish");
		e.setStandard("10th");
		e.setMarks(545);
		e.setGrade('A');
		//printing values
		System.out.println("Name is:" + e.getName());
		System.out.println("standard is:" + e.getStandard());
		System.out.println("marks is:" + e.getMarks());
		System.out.println("grade is:" + e.getGrade());
	}
}
	

}
