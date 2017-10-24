package dao;




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
	public  UfDao ufDao(){
		return new UfJdbc(new ConexaoProducao());
	}
}
