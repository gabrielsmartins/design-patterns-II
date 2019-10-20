package br.alura.patterns.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection connection;
	private static String jdbcUrl = null;
	private static String user = null;
	private static String password = null;
	
	public Connection getConnection() {
		try {
			String driverType = System.getProperty("jdbc.url.type");
			if ("h2".equals(driverType)) {
				jdbcUrl = DatabaseConfiguration.getProperty("jdbc.h2.url");
				user = DatabaseConfiguration.getProperty("jdbc.h2.user");
				password = DatabaseConfiguration.getProperty("jdbc.h2.password");
                connection = DriverManager.getConnection(jdbcUrl, user,password);
                return connection;
			} else if("hsql".equals(driverType)){
				jdbcUrl = DatabaseConfiguration.getProperty("jdbc.hsql.url");
				user = DatabaseConfiguration.getProperty("jdbc.hsql.user");
				password = DatabaseConfiguration.getProperty("jdbc.hsql.password");
				connection = DriverManager.getConnection(jdbcUrl, user,password);
                return connection;
			}else if("derby".equals(driverType)){
				jdbcUrl = DatabaseConfiguration.getProperty("jdbc.derby.url");
				user = DatabaseConfiguration.getProperty("jdbc.derby.user");
				password = DatabaseConfiguration.getProperty("jdbc.derby.password");
				connection =  DriverManager.getConnection(jdbcUrl, user,password);
                return connection;
			}else if("sqlite".equals(driverType)){
				jdbcUrl = DatabaseConfiguration.getProperty("jdbc.sqlite.url");
				user = DatabaseConfiguration.getProperty("jdbc.sqlite.user");
				password = DatabaseConfiguration.getProperty("jdbc.sqlite.password");
				connection = DriverManager.getConnection(jdbcUrl, user,password);
                return connection;
			}
			throw new RuntimeException("Conexão não disponível para o banco de dados informado");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
