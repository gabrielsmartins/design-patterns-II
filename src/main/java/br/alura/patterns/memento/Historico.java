package br.alura.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	private List<Estado> estados = new ArrayList<>();
	
	public void adiciona(Estado estado) {
		this.estados.add(estado);
	}
	public Estado getEstado(Integer index) {
		return this.estados.get(index);
	}
}
