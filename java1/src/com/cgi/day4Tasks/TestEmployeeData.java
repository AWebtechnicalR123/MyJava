package com.cgi.day4Tasks;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.cgi.day4.JDBCTest;

class TestEmployeeData {
	
	
	@Test
	void testProcesssqlStmt() {
		EmployeesData edt = new EmployeesData();
		Connection con = edt.connectToDb();
		edt.processSqlStmt(con);
		
	}

}
