package model;

import java.time.LocalDate;

public class Pedido {

	private Integer codigo;
	private LocalDate data;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pedido(){
		
	}
	
	public Pedido(Integer codigo){
		this.codigo = codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public LocalDate getData() {
		return data;
	}
}
