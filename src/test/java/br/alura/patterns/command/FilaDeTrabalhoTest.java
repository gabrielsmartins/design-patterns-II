package br.alura.patterns.command;

import org.junit.Test;

public class FilaDeTrabalhoTest {
	
	
	@Test
	public void deveProcessarAcoes() {
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		Pedido pedido1 = new Pedido(1L, "João da Silva");
		Pedido pedido2 = new Pedido(2L, "José Nascimento");
		Pedido pedido3 = new Pedido(3L, "Maria Pereira");
		Pedido pedido4 = new Pedido(4L, "Ana Paula");
		
		
		fila.adicionaComando(new Separa(pedido1));
		fila.adicionaComando(new Separa(pedido2));
		fila.adicionaComando(new Separa(pedido3));
		fila.adicionaComando(new Separa(pedido4));
		
		
		fila.adicionaComando(new Pagamento(pedido1));
		fila.adicionaComando(new Pagamento(pedido2));
		fila.adicionaComando(new Pagamento(pedido3));
		fila.adicionaComando(new Pagamento(pedido4));
		
		
		fila.adicionaComando(new Finalizacao(pedido1));
		fila.adicionaComando(new Finalizacao(pedido2));
		fila.adicionaComando(new Finalizacao(pedido3));
		fila.adicionaComando(new Finalizacao(pedido4));
		
		fila.executa();
	}
	

}
