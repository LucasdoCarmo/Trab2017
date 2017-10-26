package dao;

import model.Usuario;

public interface UsuarioDAO extends CrudDao<Usuario> {

	Usuario getIDPorNome(String nome);

}
