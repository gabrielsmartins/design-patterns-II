package br.alura.patterns.command;

public class Pagamento implements Comando {
	
	private Pedido pedido;
	
	public Pagamento(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("Pagando pedido: " + this.pedido.getId());
		this.pedido.paga();
	}

}
