package br.com.sistemaEscolar.model;

public class PessoaEscolar extends Pessoa{
	
	private String codigo;
	private String matricula;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


}
