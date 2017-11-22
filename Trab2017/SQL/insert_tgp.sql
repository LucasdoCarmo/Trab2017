insert into cliente(idCliente, CPF, DataNascimento,Nome) values
		(1,12345678910,'1990-05-05','Jacinto Doralino Rego'),
        (2,12345678911,'1996-05-05','Tomas Turbando');
        
select * from cliente;

insert into funcionario(idFuncionario, CPF, DataNascimento, NomeArtistico, NomeReal, Funcao) values
		(1,12345678910,'1990-05-05','Oitava Maravilha', 'Jacinto Doralino Rego','Segurança'),
        (2,23456789101,'2001-01-01','Chave de Cadeia','Fabioli Cruzt','Bar Tender'),
        (3,66666666666,'1992-06-06','Castidade', 'Jenifer Freitas', 'Striper'),
        (4,11111111111,'1990-05-05','Fenix', 'Catarina Castro', 'Puta');
        
select * from funcionario;

insert into produto(idProduto, GTIN, Nome, Marca, Conteudo, Valor) values
		(1,'1515','Guarana','Tupi','un',15),
        (2,'1516','Wiskey','Drulis','un',15);
        
