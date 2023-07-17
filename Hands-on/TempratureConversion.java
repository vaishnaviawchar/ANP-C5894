package loops;
/*Prompt the user to enter a temperature in Celsius.
Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
Use a switch case statement to perform the selected conversion and display the result.
Handle invalid conversion choices appropriately.*/

//importing scanner class
import java.util.Scanner;
public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
		//input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temprature in celcius : ");
		
		//input for temperature
		int temperature=sc.nextInt();
		
		System.out.println("Available conversion type: ");
		System.out.println("1.Fahrenheit");
		System.out.println("2.Kelvin");
		System.out.println("3.Rankine");
		System.out.println("Enter your choice : ");
		
		//input variable for conversion
		int conversion=sc.nextInt();
		
		//declaring variable
		double result;
                String conversionType;

                //switch case
		switch (conversion) 
		{
                    case 1:
                    result = (temperature * 9 / 5) + 32;
                    conversionType = "Fahrenheit";
                    break;
            
		    case 2:
            	    result = temperature + 273.15;
                    conversionType = "Kelvin";
                    break;
            
		    case 3:
            	    result = (temperature + 273.15) * 9 / 5;
                    conversionType = "Rankine";
                    break;
            
		    default:
                    System.out.println("Handle invalid conversion choices appropriately.");
                    return;
        }

        System.out.println("Converted temperature in " + conversionType + ": " + result);
    }
}
