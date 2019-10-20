package br.alura.patterns.memento;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class HistoricoTest {

	@Test
	public void deveObterPrimeiroEstado() {
		Historico historico = new Historico();
		
		Contrato contrato = new Contrato(LocalDateTime.now(), "Cliente Teste", TipoContrato.NOVO);
		
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		assertEquals(TipoContrato.NOVO, historico.getEstado(0).getContrato().getTipo());
	}
	
	
	@Test
	public void deveResturarEstado() {
		Historico historico = new Historico();
		
		Contrato contrato = new Contrato(LocalDateTime.now(), "Cliente Teste", TipoContrato.NOVO);
		
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.restaura(historico.getEstado(1));
		assertEquals(TipoContrato.EM_ANDAMENTO, contrato.getTipo());
	}
}
