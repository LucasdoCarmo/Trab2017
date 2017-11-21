package model;

public class Cliente {

	private Long codigo;
	private int Cpf;
	private String dataNascimento;
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
		this.Cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente() {
		super();
	}

	public Cliente(Long codigo, int cpf, String dataNascimento, String nome) {
		super();
		this.codigo = codigo;
		Cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
	}

}