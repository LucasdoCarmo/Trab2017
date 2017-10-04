package model;

import java.math.BigInteger;
import java.sql.Date;


public class Funcionario {

	private Long codigo;
	private BigInteger  Cpf;
	private  Date dataNascimento;
	private String nomeArtistico;
	private String funcao;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public BigInteger getCpf() {
		return Cpf;
	}
	public void setCpf(BigInteger cpf) {
		Cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
