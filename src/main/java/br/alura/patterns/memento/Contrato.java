package br.alura.patterns.memento;

import java.time.LocalDateTime;

public class Contrato {

	private LocalDateTime data;
    private String cliente;
    private TipoContrato tipo;
    
	public Contrato(LocalDateTime data, String cliente, TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}
	
	
	public void avanca() {
		if(this.tipo == TipoContrato.NOVO)
			this.tipo = TipoContrato.EM_ANDAMENTO;
			else if(this.tipo == TipoContrato.EM_ANDAMENTO)
				this.tipo = TipoContrato.ACERTADO;
			else if(this.tipo == TipoContrato.ACERTADO)
				this.tipo = TipoContrato.CONCLUIDO;
		
	}
	
	public Estado salvaEstado() {
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}
    
	
	 public void restaura(Estado estado) {
	        this.data = estado.getContrato().getData();
	        this.cliente = estado.getContrato().getCliente();
	        this.tipo = estado.getContrato().getTipo();
	    }
    
    
    
    
}
