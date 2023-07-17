package loops;
import java.util.Scanner;
public class TempratureConversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temprature in celcius : ");
		int temprature=sc.nextInt();
		
		System.out.println("Available conversion type: ");
		System.out.println("1.Fahrenheit");
		System.out.println("2.Kelvin");
		System.out.println("3.Rankine");
		System.out.println("Enter your choice : ");
		
		int choice=sc.nextInt();
		double result;
        String conversionType;

        switch (choice) {
            case 1:
                result = (temprature * 9 / 5) + 32;
                conversionType = "Fahrenheit";
                break;
            case 2:
            	result = temprature + 273.15;
                conversionType = "Kelvin";
                break;
            case 3:
            	result = (temprature + 273.15) * 9 / 5;
                conversionType = "Rankine";
                break;
            default:
                System.out.println("Handle invalid conversion choices appropriately.");
                return;
        }

        System.out.println("Converted temperature in " + conversionType + ": " + result);
    }
}