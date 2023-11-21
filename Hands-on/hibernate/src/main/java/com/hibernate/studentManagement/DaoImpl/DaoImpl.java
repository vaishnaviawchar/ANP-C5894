package com.hibernate.studentManagement.DaoImpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hibernate.studentManagement.Dao.StudentDao;
import com.hibernate.studentManagement.config.HibernateConfig;
import com.hibernate.studentManagement.entity.Student;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DaoImpl implements StudentDao {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();

        String studentName, studentlastName, Address, studentCourse;
        long mobileNo;
        int studentId;

        System.out.println("Enter the StudentId: ");
        studentId = sc.nextInt();
        System.out.println("Enter the First name: ");
        studentName = sc.next();
        System.out.println("Enter the Last name: ");
        studentlastName = sc.next();
        System.out.println("Enter the address: ");
        Address = sc.next();
        System.out.println("Enter the Course: ");
        studentCourse = sc.next();
        System.out.println("Enter the Mobile no.: ");
        mobileNo = sc.nextLong();

        Student s = new Student();
        s.setStudentId(studentId);
        s.setStudentName(studentName);
        s.setStudentlastName(studentlastName);
        s.setAddress(Address);
        s.setStudentCourse(studentCourse);
        s.setMobileNo(mobileNo);

        session.save(s);
        ts.commit();
        session.close();
        System.out.println("Student data has been saved successfully!!");
    }

    @Override
    public void deleteStudent() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();

        System.out.println("Enter the Student Id to Delete: ");
        int studentId = sc.nextInt();
        Student studentToDelete = session.get(Student.class, studentId);
        if (studentToDelete != null) {
            session.delete(studentToDelete);
            ts.commit();
            System.out.println("Student with ID " + studentId + " has been deleted.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }

        session.close();
    }

    @Override
    public void editStudent() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();

        System.out.println("Enter the Student ID to edit: ");
        int studentId = sc.nextInt();

        Student studentToEdit = session.get(Student.class, studentId);
        if (studentToEdit != null) {
            boolean isEditing = true;
            while (isEditing) {
                System.out.println("Select the field to edit:");
                System.out.println("1. First Name");
                System.out.println("2. Last Name");
                System.out.println("3. Address");
                System.out.println("4. Course");
                System.out.println("5. Mobile no");
                System.out.println("6. Exit");

                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter the new first name: ");
                        String newFirstName = sc.nextLine();
                        studentToEdit.setStudentName(newFirstName);
                        break;
                    case 2:
                        System.out.println("Enter the new last name: ");
                        String newLastName = sc.nextLine();
                        studentToEdit.setStudentlastName(newLastName);
                        break;
                    case 3:
                        System.out.println("Enter the new Address: ");
                        String newAddress = sc.nextLine();
                        studentToEdit.setAddress(newAddress);
                        break;
                    case 4:
                        System.out.println("Enter the new Course: ");
                        String newCourse = sc.nextLine(); // Read the entire line
                        studentToEdit.setStudentCourse(newCourse);
                        break;

                    case 5:
                        System.out.println("Enter the new mobile number: ");
                        long newMobileNumber = sc.nextLong();
                        studentToEdit.setMobileNo(newMobileNumber);
                        break;
                    case 6:
                        isEditing = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
            ts.commit();
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
        session.close();
    }

    @Override
    public void displayStudent() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        List<Student> students = session.createQuery("FROM Student", Student.class).list();
        session.close();

        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println("Student ID: " + s.getStudentId());
            System.out.println("First Name: " + s.getStudentName());
            System.out.println("Last Name: " + s.getStudentlastName());
            System.out.println("Address: " + s.getAddress());
            System.out.println("Course: " + s.getStudentCourse());
            System.out.println("Mobile No: " + s.getMobileNo());
        }
    }
}
