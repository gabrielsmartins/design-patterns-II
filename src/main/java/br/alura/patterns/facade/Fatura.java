package br.alura.patterns.facade;

public class Fatura {
	
	private Cliente cliente;
	private Double valor;
	
	
	public Fatura(Cliente cliente, Double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	

}
