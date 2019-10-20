package br.alura.patterns.adapter;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import org.junit.Test;

public class RelogioSistemaTest {

	@Test
	public void deveRetornarDataAtual() {
		Relogio relogioSistema = new RelogioSistema();
		Calendar hoje = relogioSistema.hoje();
		assertNotNull(hoje);
	}
}
