package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	private Long codigo;
	private String nome;
	private String senha;
	
	
	public Usuario(Long codigo, String nome, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.senha = senha;
	}


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Usuario(Long codigo) {
		this.codigo = codigo;
	}
	
}