package com.jdbcconenction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//Add Jars to the project
public class JDBCConnection {
	public static void main(String[] args) throws Exception {
		//Step 1 : Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Make the DB Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		
		//Step 3: Create the Statement or Prepared Statement
		Statement st = con.createStatement();
		
		//Step 4: Execute the Query
		st.executeUpdate("insert into students (rollNo, name, city) values(108, 'Sam', 'Pune')");
		
		//Step 5: Close all connections
		st.close();
		con.close();
		

	}
}
