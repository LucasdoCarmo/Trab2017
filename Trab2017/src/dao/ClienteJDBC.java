package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.edu.unoesc.revisaoOO.dao.ConexaoUtil;
import model.Cliente;

public class ClienteJDBC implements ClienteDAO{

	@Override
	public void inserir(Cliente cliente) {
		// TODO Auto-generated method stub
		try {
			Connection con = ConexaoUtil.getCon();
			String insert = "insert into cliente values(codigo,?,?,?,?)";
			PreparedStatement insertStmt = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
			insertStmt.setString(1, cliente.getNome());
			insertStmt.setInt(2, cliente.getCpf());
			insertStmt.setDate(3, Date.valueOf(cliente.getDataNascimento()));
			insertStmt.setLong(4, cliente.getAgenciaPreferencial().getCodigo());
			insertStmt.executeUpdate();
			ResultSet resultSet = insertStmt.getGeneratedKeys();
			resultSet.next();
			cliente.setCodigo(resultSet.getLong(1));
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void alterar(Cliente entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente get(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
