package loops;
//Simple Switch Case example
import java.util.Scanner;
public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day (1-7): ");
		int day=sc.nextInt();
		String dayname;
		
		//switch case
		switch(day)
		{
		  case 1:
		  dayname="Monday";
		  //break statment is used to jump out of the loop
		  break;
		  
		  case 2:
		  dayname="Tuesday";
		  //break statment is used to jump out of the loop
		  break;
			  
		  case 3:
		  dayname="Wedensday";
		  //break statment is used to jump out of the loop
		  break;
			  
		  case 4:
		  dayname="Thursday";
		  //break statment is used to jump out of the loop
		  break;
			  
		  case 5:
		  dayname="Friday";
		  //break statment is used to jump out of the loop
		  break;
			  
		  case 6:
		  dayname="Saturday";
		  //break statment is used to jump out of the loop
		  break;
			  
		  case 7:
		  dayname="Sunday";
		  //break statment is used to jump out of the loop
		  break;
			  
		  default:
		  dayname="Invaid Day";
		  //break is used to jump out of the loop
		  break;	
		
		}
		System.out.println("The day is: " +dayname);
		sc.close();
	}

}
