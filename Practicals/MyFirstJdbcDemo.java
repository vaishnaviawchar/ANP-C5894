package com.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJdbcDemo 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step 1: Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2: Create the Connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		//step 3: Create the Statement object
		Statement stmt = con.createStatement();
		
		//step 4: Execute the queries 
		int a=stmt.executeUpdate("insert into employee values(2,'Anand','Mechanical',334545)");
		
		System.out.println("Successfully added employee" +a);
		 
		//step 5: Close the Db resources
		con.close();

	}

}
