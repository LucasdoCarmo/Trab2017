package dao;

import conexao.Conexao;
import conexao.ConexaoProducao;
import conexao.ConexaoTeste;

public class DaoFactory {

	private static DaoFactory daoFactory;
	Conexao conexao = new ConexaoProducao();
	
	public static DaoFactory get(){
		if(daoFactory == null){
			daoFactory = new DaoFactory();
			String ambiente = System.getProperty("ambiente");
			if("test".equals(ambiente)){
				daoFactory.conexao = new ConexaoTeste();
			}
		}
		return daoFactory;
	}
	
	public UsuarioDAO usuarioDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}
