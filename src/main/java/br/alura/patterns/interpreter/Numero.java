package br.alura.patterns.interpreter;

import br.alura.patterns.visitor.Visitor;

public class Numero implements Expressao {

	private int valor;

	public Numero(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int avalia() {
		return this.valor;
	}
	
	public int getValor() {
		return valor;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);	
	}

}
