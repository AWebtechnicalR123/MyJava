package com.cgi.day4Tasks;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeesData {
	//hire_date, email, id, fna, salary, emp table in hr
	private Connection conn = null;
	public Connection connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/hr?" + "user=root&password=Natar@123");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	
	public void processSqlStmt(Connection con) {
		try {
			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery("select * from Employees");
			
			Date hd = null;
			String em = null;
			int id=0;
			Double sal = null;
			String fname=null;
			while(rst.next()) {
				hd = rst.getDate("hire_date");
				em=rst.getString("email");
				id =rst.getInt("employee_id");
				fname = rst.getString("first_name");
				sal = rst.getDouble("salary");
				
				System.out.println(hd+" " + em + " " + id+" "+fname+" "+sal);
				
				
			}
		} catch(Exception es) {
			es.printStackTrace();
		}
	
	}
}
