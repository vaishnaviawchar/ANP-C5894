package oops;

 class Exam {
private String Name;	 
private String Standard;
private int marks;
private char grade;

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getStandard() {
	return Standard;
}
public void setStandard(String Standard) {
	this.Standard = Standard;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
class ExamMain
{
	public static void main(String[] args)
	{
		Exam e = new Exam();
		e.setName("ashish");
		e.setStandard("10th");
		e.setMarks(545);
		e.setGrade('A');
		
		System.out.println("Name is:" + e.getName());
		System.out.println("standard is:" + e.getStandard());
		System.out.println("marks is:" + e.getMarks());
		System.out.println("grade is:" + e.getGrade());
	}
}
	

}
