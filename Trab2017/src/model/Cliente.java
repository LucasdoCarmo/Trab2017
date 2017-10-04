package model;

import java.sql.Date;

public class Cliente {
	
	
	private int Cpf;
	private  Date dataNascimento;
	
	public int getCpf() {
		return Cpf;
	}

	public void setCpf(int Cpf) {
		this.Cpf = Cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}