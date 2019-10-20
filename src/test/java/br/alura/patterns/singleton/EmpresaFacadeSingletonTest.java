package br.alura.patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.alura.patterns.facade.EmpresaFacade;

public class EmpresaFacadeSingletonTest {

	@Test
	public void deveRetornarInstancia() {
		EmpresaFacade empresaFacade = EmpresaFacadeSingleton.getInstance();
		assertNotNull(empresaFacade);
	}
}
