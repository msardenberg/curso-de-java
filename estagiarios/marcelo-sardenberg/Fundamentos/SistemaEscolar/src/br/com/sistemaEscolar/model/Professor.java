package br.com.sistemaEscolar.model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends PessoaEscolar{
	
	private List<Materia> materias = new ArrayList<Materia>();

	
	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	

}
