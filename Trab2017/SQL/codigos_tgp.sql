create view ClienteFuncionario as
select c.nome from cliente as c
join funcionario as f
on c.CPF = f.CPF;


create view FuncionariosDeMenor as
select NomeArtistico, NomeReal from funcionario
where (year(current_date()) - year(DataNascimento))<= 17 ;


delimiter $$ 

create trigger trg_insert_produto 
after insert on produto
for each row
begin
	declare _idpedido bigint(20);	
    declare _total decimal(12,2);	
    set _idpedido = new.idpedido;	
    
    select sum(quantidade * valor_unitario)
		into _total
		from produto where idpedido=_idpedido;
    
    update pedido set total=_total where id=_idpedido;


end$$

create trigger trg_delete_produto
after update on produto
for each row
begin
	declare _idpedido bigint(20);	
    declare _total decimal(12,2);	
    set _idpedido = old.idpedido;	
    
    select sum(quantidade * valor_unitario)
		into _total
		from produto where idpedido=_idpedido;
    
    update pedido set total=_total where id=_idpedido;
    
    set _idpedido = NEW.idpedido;
    select 
    coalesce(sum(quantidade * valor_unitario), 0)
		into _total
		from item where idpedido=_idpedido;
    update pedido set total=_total where id=_idpedido;
    
end$$

create trigger trg_insert_servico 
after insert on servico
for each row
begin
	declare _idpedido bigint(20);	
    declare _total decimal(12,2);	
    set _idpedido = new.idpedido;	
    
    select sum(quantidade * valor_unitario)
		into _total
		from servico where idpedido=_idpedido;
    
    update pedido set total=_total where id=_idpedido;


end$$

create trigger trg_delete_servico
after update on produto
for each row
begin
	declare _idpedido bigint(20);	
    declare _total decimal(12,2);	
    set _idpedido = old.idpedido;	
    
    select sum(quantidade * valor_unitario)
		into _total
		from servico where idpedido=_idpedido;
    
    update pedido set total=_total where id=_idpedido;
    
    set _idpedido = NEW.idpedido;
    select 
    coalesce(sum(quantidade * valor_unitario), 0)
		into _total
		from item where idpedido=_idpedido;
    update pedido set total=_total where id=_idpedido;
    
end$$

delimiter ;



SELECT a.Nome, b.Nome
FROM TabelaA as A
INNER JOIN TabelaB as B
                on a.Nome = b.Nome