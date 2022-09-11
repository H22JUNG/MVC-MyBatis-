package com.sample.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static String connect = "jdbc:mariadb://localhost:3306/bbs1";
	private static String user = "root";
	private static String passwd = "1234";
	
	private static Connection conn = null;
	
	static {
		try {
			Class.forName ("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(connect, user, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConn() {
		return conn;
	}
}
