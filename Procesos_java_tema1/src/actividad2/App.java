package actividad2;

import java.io.IOException;


public class App {

	public static void main(String[] args) throws IOException {
				
		LanzadorProcesos lp = new LanzadorProcesos();
		lp.ejecutar("cmd /c dir");
			
	}
}
