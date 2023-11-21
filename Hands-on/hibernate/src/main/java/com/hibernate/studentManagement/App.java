package com.hibernate.studentManagement;

import java.util.Scanner;

import com.hibernate.studentManagement.DaoImpl.DaoImpl;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaoImpl impl = new DaoImpl();
        
        char choice;
        
        do {
            System.out.println("Student Registration");
            System.out.println("1. Add 2. Edit 3. Delete 4. Display 5. Exit");
            System.out.println("Enter your choice: ");
            
            int operationChoice = sc.nextInt();
            sc.nextLine(); 
            
            switch (operationChoice) {
                case 1:
                    impl.addStudent();
                    break;
                case 2:
                    impl.editStudent();
                    break;
                case 3:
                    impl.deleteStudent();
                    break;
                case 4:
                    impl.displayStudent();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
            
            System.out.println("Do you want to perform another operation (Y/N)? ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'Y');
        
        System.out.println("THANKS");
        sc.close();
    }
}
