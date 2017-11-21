package dao;

import model.ConexaoUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteJDBC extends ConexaoUtil implements ClienteDAO {

	@Override
	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<>();

		try {

			Connection con = ConexaoUtil.getCon();
			Statement stmt = con.createStatement();
			String sql = "select * from cliente";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getInt("cpf"));

				cliente.setDataNascimento(rs.getString("data"));
				clientes.add(cliente);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return clientes;
	}

	@Override
	public void inserir(Cliente cliente) {

		try {
			Connection con = model.ConexaoUtil.getCon();
			String insert = "insert into cliente values(codigo,?,?,?,?)";
			PreparedStatement insertStmt = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
			insertStmt.setString(1, cliente.getNome());
			insertStmt.setInt(2, cliente.getCpf());
			insertStmt.setDate(3, Date.valueOf(cliente.getDataNascimento()));
			insertStmt.setLong(4, cliente.getCodigo());
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

	}

	@Override
	public void excluir(Long codigo) {

	}

	@Override
	public Cliente get(Long codigo) {
		return null;
	}

}
