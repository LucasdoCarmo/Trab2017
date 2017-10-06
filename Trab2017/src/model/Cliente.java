package model;

import java.math.BigInteger;
import java.sql.Date;

public class Cliente {
	
	private Long codigo;
	private BigInteger  Cpf;
	private  Date dataNascimento;
	private String nome;
	
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

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