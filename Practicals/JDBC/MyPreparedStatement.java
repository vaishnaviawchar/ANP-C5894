package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyPreparedStatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step 1: Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
					
		//step 2: Create the Connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		//step 3: 
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?)");
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the ID");
		int id=sc.nextInt();
		
		System.out.println("Please enter the Name");
		String name=sc.next();
		
		System.out.println("Please enter the Designation");
		String desig=sc.next();
		
		System.out.println("Please enter the Salary");
		int sal=sc.nextInt();
		
		
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3, desig);
		pstmt.setInt(4, sal); // create statement // 3 step
		
		int i=pstmt.executeUpdate(); // 4 step // execute query
		System.out.println("Employee data added successfully");
		//con.close();
		con.close();
		
		
	
	}

}
