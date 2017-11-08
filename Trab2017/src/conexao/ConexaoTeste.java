package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoTeste implements Conexao{
	
	private static Connection con;
	
	static{
		open();
	}
	
	private static void open(){
		String url = System.getProperty("url_teste");
		String username = System.getProperty("username_teste");
		String password = System.getProperty("password_teste");
		// Vai até o banco de dados e cria uma conexão.
		try {
			con = DriverManager.getConnection(url,
					username, password);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public Connection get() {
		try {
			if(con.isClosed()){
				open();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}