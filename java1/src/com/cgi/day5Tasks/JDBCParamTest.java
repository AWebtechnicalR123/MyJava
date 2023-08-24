package com.cgi.day5Tasks;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class JDBCParamTest {

	@Test
	void testProcessSql() {
		JDBCParam prm = new JDBCParam();
		Connection con = prm.connectToDb();
		prm.processSql(con);
	}

}
