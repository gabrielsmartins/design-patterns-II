package br.alura.patterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class DatabaseConfiguration {

	private static Properties properties;

	static {
		try {
			properties = new Properties();
			ClassLoader classLoader = DatabaseConfiguration.class.getClassLoader();
			InputStream inputStream = classLoader.getResourceAsStream("application.properties");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line = bufferedReader.readLine();
			fillWithProperty(line);
			while (line != null) {
				line = bufferedReader.readLine();
				fillWithProperty(line);
			}
			bufferedReader.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static void fillWithProperty(String line) {
		if (line != null) {
			if(!line.contains("#") && !line.equals("\n") && !line.isEmpty()) {
				String[] parts = line.split("=");
				properties.put(parts[0], parts[1]);
			}
			
		}
	}

	public static String getProperty(String name) {
		return properties.getProperty(name);
	}

}
