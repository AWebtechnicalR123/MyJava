package com.cgi.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	
	Connection conn = null;
	public Connection connectToDb() {
		try {
			//The newinstance() call is work around for some 
			//broke java implementations
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/hr?" + "user=root&password=Natar@123");
			
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	
	public void procesSqlStmt(Connection con) {
		try{
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery("Select * from Employees");

			int empId = 0;
			String firstName = null;
			Double sal = null;
			
			while(rs.next()) {
				empId = rs.getInt(1);//second collumn or we can pass collumn name
				firstName = rs.getString(2);//second collumn
				sal = rs.getDouble("Salary");
				System.out.println(empId+" "+firstName+" "+sal);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
