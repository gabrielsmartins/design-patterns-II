package br.alura.patterns.facade;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EmpresaFacadeTest {
	
	@Test
	public void deveConsultarClientePorCpf() {
		EmpresaFacade empresaFacade = new EmpresaFacade();
		
		String cpf = "362.055.788.00";
		Cliente cliente = empresaFacade.buscaCliente(cpf);
		
		assertNotNull(cliente);
	}

}
