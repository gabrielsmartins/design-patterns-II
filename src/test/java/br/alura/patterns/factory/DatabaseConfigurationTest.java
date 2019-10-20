package br.alura.patterns.factory;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DatabaseConfigurationTest {

	@Test
	public void deveLerPropriedadesH2() {
		String property = DatabaseConfiguration.getProperty("jdbc.h2.url");
		assertNotNull(property);
	}
}
