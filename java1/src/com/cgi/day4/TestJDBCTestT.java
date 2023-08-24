package com.cgi.day4;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;



class TestJDBCTestT {



	@Test
	void testConnectToDb() {
		Connection con=null;
		JDBCTest jb = new JDBCTest();
		try {
			con = jb.connectToDb();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		assertNotNull(con);
	}
	
	@Test
	void testProcessSqlStmt() {
		JDBCTest jb = new JDBCTest();
		Connection con = jb.connectToDb();
		jb.procesSqlStmt(con);
	}
	
}
