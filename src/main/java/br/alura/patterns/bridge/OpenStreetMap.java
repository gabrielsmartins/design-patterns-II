package br.alura.patterns.bridge;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class OpenStreetMap implements Mapa {
	
	private static final String BASE_URL = "https://www.openstreetmap.org/search?query=";

	@Override
	public String getAddress(String street) {
		try {
			StringBuilder response = new StringBuilder();
			URL url = new URL(BASE_URL + street.replaceAll(" ", "+"));
			InputStream stream = url.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			String line = reader.readLine();
			response.append(line);
			while(line != null) {
				line = reader.readLine();
				response.append(line);
			}
		return response.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
