package br.alura.patterns.facade;

public class ContatoCliente {

	private Cliente cliente;
	private Cobranca cobranca;

	public ContatoCliente(Cliente cliente, Cobranca cobranca) {
		this.cliente = cliente;
		this.cobranca = cobranca;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cobranca getCobranca() {
		return cobranca;
	}

	public void setCobranca(Cobranca cobranca) {
		this.cobranca = cobranca;
	}

	public void dispara() {
		// TODO Auto-generated method stub
		
	}

	
	
}
