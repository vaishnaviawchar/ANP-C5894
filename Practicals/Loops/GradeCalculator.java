package loops;
/*Prompt the user to enter a numerical grade (0-100).
Use a switch case statement to determine the corresponding letter grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
Display the letter grade to the user.
Handle input validation to ensure the grade is within the valid range.*/

//importing scanner class
import java.util.Scanner;
public class GradeCalculator 
{
	public static void main(String[] args)
	{
		//input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numerical grade (0-100): ");
		
		//integer input for grade
		int grade=sc.nextInt();
		
		//declaring variable
		String lettergrade;
		
		//if condition to check grade is greater than equal to 0 and less than equal to 100.
		if (grade >= 0 && grade <= 100) 
		{
			//switch case
			switch (grade / 10) 
            {
                case 10:
                case 9:
                    lettergrade = "A";
                    break;
                case 8:
                    lettergrade = "B";
                    break;
                case 7:
                    lettergrade = "C";
                    break;
                case 6:
                    lettergrade = "D";
                    break;
                default:
                    lettergrade = "E";
                    break;
                   
            }
            System.out.println("Letter grade: " + lettergrade);
        } 
		else 
        {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        
        }
		
	}
}

           

