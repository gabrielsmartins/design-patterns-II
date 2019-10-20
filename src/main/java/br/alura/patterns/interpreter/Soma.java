package br.alura.patterns.interpreter;

import br.alura.patterns.visitor.Visitor;

public class Soma implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorEsquerda = this.esquerda.avalia();
		int valorDireita = this.direita.avalia();
		return valorEsquerda + valorDireita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSoma(this);	
	}
}
