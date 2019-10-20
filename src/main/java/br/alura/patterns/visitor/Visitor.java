package br.alura.patterns.visitor;

import br.alura.patterns.interpreter.Numero;
import br.alura.patterns.interpreter.Soma;
import br.alura.patterns.interpreter.Subtracao;

public interface Visitor {
	
	public void visitaSoma(Soma soma);
	public void visitaSubtracao(Subtracao substracao);
	public void visitaNumero(Numero numero);
	
}
