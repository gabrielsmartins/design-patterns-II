package br.alura.patterns.facade;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClienteDao {
	
	private static final Map<Long, Cliente> clientes = new LinkedHashMap<>();
	
	public ClienteDao() {
		clientes.put(1L, new Cliente(1L, "João", "362.055.788.00"));
		clientes.put(2L, new Cliente(2L, "José", "362.055.788.01"));
		clientes.put(3L, new Cliente(3L, "Maria", "362.055.788.02"));
	}

	public Cliente buscaPorCpf(String cpf) {
		return clientes.entrySet()
		            .stream()
		            .filter(c -> c.getValue().getCpf().equals(cpf))
		            .findFirst()
		            .get()
		            .getValue();
	}
	
	
	
 
}
