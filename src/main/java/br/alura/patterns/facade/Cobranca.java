package br.alura.patterns.facade;

public class Cobranca {

	private Tipo boleto;
	private Fatura fatura;

	public Cobranca(Tipo boleto, Fatura fatura) {
		this.boleto = boleto;
		this.fatura = fatura;
	}

	public Tipo getBoleto() {
		return boleto;
	}

	public void setBoleto(Tipo boleto) {
		this.boleto = boleto;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public void emite() {
		// TODO Auto-generated method stub
		
	}

	
	
}
