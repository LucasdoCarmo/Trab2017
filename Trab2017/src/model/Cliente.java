package model;

import java.math.BigInteger;
import java.sql.Date;

public class Cliente {
	
	private Long codigo;
	private int  Cpf;
	private  Date dataNascimento;
	private String nome;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}