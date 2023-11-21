package loops;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the number of elements in the series: ");
        int count = scanner.nextInt();

        System.out.print("Enter the series of numbers: ");

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Sum of the series: " + sum);
    }
}


