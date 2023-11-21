package com.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class MySecondJdbsDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step 1: Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		//step 2: Create the Connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			
		//step 3: Create the Statement object
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		int id, salary;
		String name, desig;
		System.out.println("Employee Details:");
		System.out.println("================");
		
		while(rs.next())
		{
			id = rs.getInt(1);
			name = rs.getNString(2);
			desig = rs.getString(3);
			salary = rs.getInt(4);
			System.out.println(id+"  "+name+"  "+desig+"   "+salary );
		}
		con.close();
	}

}
