package br.com.visagio.vale.ssoinfocenter.control.configuration.exer;

public abstract class Pessoa {

	public Pessoa(String nome){
		this.nome = nome;
	}
	
	private String nome;
	private String cpf;
	private String telefone;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
