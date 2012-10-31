package br.com.visagio.vale.ssoinfocenter.control.configuration.exer;

public class Aluno extends Pessoa{

	public Aluno(String nome, String matricula) {
		super(nome);
		this.setMatricula(matricula);
	}
	
	private String matricula;
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
}
