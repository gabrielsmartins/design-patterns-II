package br.alura.patterns.interpreter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomaTest {

	@Test
	public void deveInterpretarExpressaoDeSoma() {
		Expressao expressao1 = new Soma(new Numero(10), new Numero(5));
		Expressao expressao2 = new Soma(new Numero(20), new Numero(10));
		Expressao soma = new Soma(expressao1, expressao2);
		
		assertEquals(45, soma.avalia());
	}
}
