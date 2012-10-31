package br.com.sistemaEscolar.model;

public class Aluno extends PessoaEscolar{

	private String serie;
	private String sala;
	
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
}