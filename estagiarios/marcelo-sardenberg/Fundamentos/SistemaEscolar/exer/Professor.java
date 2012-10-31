package br.com.visagio.vale.ssoinfocenter.control.configuration.exer;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

	public Professor(String nome){
		super(nome);
	}

	private List<Materia> materias = new ArrayList<Materia>();

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public List<Materia> getMaterias() {
		return this.materias;
	}



}
