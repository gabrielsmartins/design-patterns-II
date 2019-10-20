package br.alura.patterns.visitor;

import br.alura.patterns.interpreter.Numero;
import br.alura.patterns.interpreter.Soma;
import br.alura.patterns.interpreter.Subtracao;

public class ImpressoraVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		System.out.print(" + ");
		soma.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaSubtracao(Subtracao substracao) {
		System.out.print("(");
		substracao.getEsquerda().aceita(this);
		System.out.print(" - ");
		substracao.getDireita().aceita(this);
		System.out.print(")");
		
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getValor());
	}



}
