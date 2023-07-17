package loops;
import java.util.Scanner;
public class GradeCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numerical grade (0-100): ");
		int grade=sc.nextInt();
		String lettergrade;
		
		if (grade >= 0 && grade <= 100) 
		{
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

           

