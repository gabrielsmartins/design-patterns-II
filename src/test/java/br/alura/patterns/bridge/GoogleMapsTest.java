package br.alura.patterns.bridge;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GoogleMapsTest {
	
	@Test
	public void deveRetornarConteudoDoMapa() {
		Mapa mapa = new GoogleMaps();
		String address = mapa.getAddress("Avenida Paulista");
		assertNotNull(address);
	}

}
