package br.alura.patterns.flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {

	public void toca(List<Nota> notas) {
		Player player = new Player();
		StringBuilder musicaEmNotas = new StringBuilder();notas.forEach(n-> musicaEmNotas.append(n.simbolo() + " "));
		player.play(musicaEmNotas.toString());
	}
}
