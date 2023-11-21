package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class StudentJdbc 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//step 1: Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//step 2: Create the Connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
				
		//step 3: 
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?,?)");
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Available operation : ");
		System.out.println("1.Add the student details");
		System.out.println("2.Retrive the student details");
		System.out.println("3.Delete the student details");
		System.out.println("4.Edit the student details");
		System.out.println("Select the operation no. to perform the operation: ");
		
		int operation=sc.nextInt();
		 switch (operation) {
         case 1:
             System.out.println("Please enter the Student ID: ");
             int id = sc.nextInt();

             System.out.println("Please enter the Student Name:");
             String name = sc.next();

             System.out.println("Please enter the Department:");
             String department = sc.next();

             System.out.println("Please enter the Age:");
             int age = sc.nextInt();

             System.out.println("Please enter the Address:");
             String address = sc.next();

             PreparedStatement stmt = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?)");
             stmt.setInt(1, id);
             stmt.setString(2, name);
             stmt.setString(3, department);
             stmt.setInt(4, age);
             stmt.setString(5, address);

             int rowsInserted = stmt.executeUpdate();
             if (rowsInserted > 0) {
                 System.out.println("Student data added successfully");
             }
             break;

         case 2:
             System.out.println("Please enter the Student ID to retrieve:");
             int retrieveId = sc.nextInt();

             PreparedStatement retrieveStmt = con.prepareStatement("SELECT * FROM student WHERE id = ?");
             retrieveStmt.setInt(1, retrieveId);
             ResultSet resultSet = retrieveStmt.executeQuery();

             if (resultSet.next()) {
                 System.out.println("Student ID: " + resultSet.getInt("id"));
                 System.out.println("Student Name: " + resultSet.getString("name"));
                 System.out.println("Department: " + resultSet.getString("department"));
                 System.out.println("Age: " + resultSet.getInt("age"));
                 System.out.println("Address: " + resultSet.getString("address"));
             } else {
                 System.out.println("Student not found.");
             }
             break;
         case 3:
             System.out.println("Please enter the Student ID to delete:");
             int deleteId = sc.nextInt();

             PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM student WHERE id = ?");
             deleteStmt.setInt(1, deleteId);

             int rowsDeleted = deleteStmt.executeUpdate();
             if (rowsDeleted > 0) {
                 System.out.println("Student data deleted successfully");
             } else {
                 System.out.println("Student not found.");
             }
             break;

         case 4:
             System.out.println("Please enter the Student ID to edit:");
             int editId = sc.nextInt();

             System.out.println("Please enter the updated Student Name:");
             String updatedName = sc.next();

             System.out.println("Please enter the updated Department:");
             String updatedDepartment = sc.next();

             System.out.println("Please enter the updated Age:");
             int updatedAge = sc.nextInt();

             System.out.println("Please enter the updated Address:");
             String updatedAddress = sc.next();

             PreparedStatement editStmt = con.prepareStatement("UPDATE student SET name=?, department=?, age=?, address=? WHERE id=?");
             editStmt.setString(1, updatedName);
             editStmt.setString(2, updatedDepartment);
             editStmt.setInt(3, updatedAge);
             editStmt.setString(4, updatedAddress);
             editStmt.setInt(5, editId);

             int rowsUpdated = editStmt.executeUpdate();
             if (rowsUpdated > 0) {
                 System.out.println("Student data updated successfully");
             } else {
                 System.out.println("Student not found.");
             }
             break;

         default:
             System.out.println("Invalid operation.");
     }

     con.close();
 }
}