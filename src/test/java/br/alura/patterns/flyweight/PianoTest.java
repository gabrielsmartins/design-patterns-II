package br.alura.patterns.flyweight;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PianoTest {
	
	@Test
	public void deveTocarNotasMusicais() {
		 NotasMusicais notas = new NotasMusicais();

	        List<Nota> doReMiFa = Arrays.asList(
	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    

	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("re"),    
	            notas.pega("re"),

	            notas.pega("do"),    
	            notas.pega("sol"),    
	            notas.pega("fa"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),

	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa")
	        );     
	        
	        Piano piano = new Piano();
	        piano.toca(doReMiFa);
	}

}
