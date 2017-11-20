package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

	private static Connection con;

	static { 
		open();
	}

	public static void open() { 
		String url = System.getProperty("url"); 
		String username = System.getProperty("username");
		String password = System.getProperty("password");

		try {
			con = DriverManager.getConnection(url, username, password); 
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public static Connection getCon() { 
		try {
			if (con.isClosed()) {
				open();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return con;
	}

	public static void close() {
		try {
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
