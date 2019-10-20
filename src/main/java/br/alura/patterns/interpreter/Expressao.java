package br.alura.patterns.interpreter;

import br.alura.patterns.visitor.Visitor;

public interface Expressao {

	public int avalia();
	public void aceita(Visitor visitor);
	
}
