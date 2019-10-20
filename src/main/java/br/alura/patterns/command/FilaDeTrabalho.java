package br.alura.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {
	
	private List<Comando> comandos = new ArrayList<>();
	
	public void adicionaComando(Comando comando) {
		this.comandos.add(comando);
	}
	
	public void executa() {
		this.comandos.forEach(c -> c.executa());
	}
}
