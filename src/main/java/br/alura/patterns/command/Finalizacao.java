package br.alura.patterns.command;

public class Finalizacao implements Comando {
	
	private Pedido pedido;
	
	public Finalizacao(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("Finalizando pedido: " + this.pedido.getId());
		this.pedido.finaliza();
	}

}
