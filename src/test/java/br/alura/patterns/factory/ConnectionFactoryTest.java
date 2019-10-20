package br.alura.patterns.factory;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

public class ConnectionFactoryTest {

	@Test
	public void deveObterConexaoParaH2() {
		System.setProperty("jdbc.url.type", "h2");
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.getConnection();
		assertNotNull(connection);
	}
	
	@Test
	public void deveObterConexaoParaHSQL() {
		System.setProperty("jdbc.url.type", "hsql");
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.getConnection();
		assertNotNull(connection);
	}
	
	@Test
	public void deveObterConexaoParaSQLLite() {
		System.setProperty("jdbc.url.type", "sqlite");
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.getConnection();
		assertNotNull(connection);
	}
}
