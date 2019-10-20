package br.alura.patterns.bridge;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OpenStreetMapTest {

	@Test
	public void deveRetornarConteudoDoMapa() {
		Mapa mapa = new OpenStreetMap();
		String address = mapa.getAddress("Avenida Paulista");
		assertNotNull(address);
	}
}
