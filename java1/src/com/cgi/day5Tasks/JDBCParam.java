package com.cgi.day5Tasks;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParam {
	private Connection conn = null;
	
	public Connection connectToDb() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost/hr?" + "user=root&password=Natar@123");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void processSql(Connection con) {
		PreparedStatement pst = null;
		try {
			String sq = "select * from employees where first_name=? and email=?";
			pst = con.prepareStatement(sq);
			pst.setString(1,"Steven");
			pst.setString(2, "SKING");
			ResultSet rst = pst.executeQuery();
			
			Date hdt = null;
			String em = null;
			int e_id=0;
			String j_id = null;
			int m_id = 0;
			int d_id = 0;
			String fname = null;
			double sal = 0;
			String lname = null;
			String pno = null;
			String c_pd = null;
			
			while(rst.next()) {
				e_id = rst.getInt(1);
				fname = rst.getString(2);
				lname = rst.getString(3);
				em = rst.getString(4);
				pno = rst.getString(5);
				hdt = rst.getDate(6);
				j_id = rst.getString(7);
				sal = rst.getDouble(8);
				c_pd = rst.getString(9);
				m_id = rst.getInt(10);
				d_id = rst.getInt(11);
				
				System.out.println(em +" "+e_id+" "+fname+" "+lname+" "+pno+" "+hdt+" "+j_id+" "+sal+" "+c_pd+" "+m_id+" "+d_id);
				
			}
			
		} catch(SQLException ex) {
				ex.printStackTrace();
		} finally{
			try {
				conn.close();			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
