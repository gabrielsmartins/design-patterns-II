package br.alura.patterns.singleton;

import br.alura.patterns.facade.EmpresaFacade;

public class EmpresaFacadeSingleton {

	private static EmpresaFacade instance;
	
	public static EmpresaFacade getInstance() {
		if(instance == null) {
			instance = new EmpresaFacade();
		}
		return instance;
	}
}
