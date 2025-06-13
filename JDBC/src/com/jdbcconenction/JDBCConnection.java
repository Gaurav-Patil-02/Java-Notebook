package com.jdbcconenction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		Statement st = con.createStatement();
		
		st.executeUpdate("insert into students (rollNo, name, city) values(108, 'Sam', 'Pune')");
		

	}
}
