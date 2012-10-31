package br.com.visagio.vale.ssoinfocenter.control.configuration.exer;

public class Materia {

	public Materia(String codigo, String materia) {
		this.codigo = codigo;
		this.materia = materia;
	}
	
	private String codigo;
	private String materia;
	
	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMateria() {
		return this.materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
}
