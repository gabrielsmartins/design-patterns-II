package br.alura.patterns.command;

public class Separa implements Comando {
	
	private Pedido pedido;
	
	public Separa(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("Separando pedido: " + this.pedido.getId());
		this.pedido.separa();
	}

}
