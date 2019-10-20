package br.alura.patterns.visitor;

import org.junit.Test;

import br.alura.patterns.interpreter.Expressao;
import br.alura.patterns.interpreter.Numero;
import br.alura.patterns.interpreter.Soma;
import br.alura.patterns.interpreter.Subtracao;

public class ImpressoraVisitorTest {

	@Test
	public void deveVisitarExpressoes() {

		Expressao expressao1 = new Subtracao(new Numero(10), new Numero(5));
		Expressao expressao2 = new Soma(new Numero(20), new Numero(10));
		Expressao soma = new Soma(expressao1, expressao2);

		Visitor visitor = new ImpressoraVisitor();
		soma.aceita(visitor);
	}
}
