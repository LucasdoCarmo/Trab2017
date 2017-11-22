package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import conexao.Conexao;

public class ConexaoUtil implements Conexao {

	private static Connection con;

	static {
		open();
	}

	private static void open() {
		
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");

		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public Connection get() {
		try {
			if (con.isClosed()) {
				open();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	public static Connection getCon() {
		return con;
	}

	public static void setCon(Connection con) {
		ConexaoUtil.con = con;
	}

	public ConexaoUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
}