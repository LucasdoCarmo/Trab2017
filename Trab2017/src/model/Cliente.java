package model;

import java.math.BigInteger;
import java.sql.Date;

public class Cliente {
	
	private Long codigo;
	private BigInteger  Cpf;
	private  Date dataNascimento;
	
	public Long getcodigo() {
		return codigo;
	}

	public void setcodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public BigInteger getCpf() {
		return Cpf;
	}

	public void setCpf(BigInteger Cpf) {
		this.Cpf = Cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}