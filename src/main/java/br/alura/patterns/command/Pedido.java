package br.alura.patterns.command;

import java.time.LocalDateTime;

public class Pedido {

	private Long id;
	private String cliente;
	private Status status = Status.NOVO;
	private LocalDateTime dataFinalizacao;
	
	public Pedido(Long id, String cliente) {
		this.id = id;
		this.cliente = cliente;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	
	public Status getStatus() {
		return status;
	}
	
	public LocalDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	public void paga() {
		this.status = Status.PAGO;
	}
	
	public void finaliza() {
		this.status = Status.ENTREGUE;
		this.dataFinalizacao = LocalDateTime.now();
	}

	public void separa() {
		this.status = Status.ITEM_SEPARADO;
	}
	
	
}
