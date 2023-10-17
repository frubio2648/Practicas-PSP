package actividad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LanzadorProcesos {

	public void ejecutar(String ruta) throws IOException {

		Process process = Runtime.getRuntime().exec(ruta);
		InputStream inputStream = process.getInputStream();

		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		} 

	}
}
