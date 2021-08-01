package fundamentosIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ArquivoEscrita {

	public static void main(String[] args) throws IOException {
		
	try (OutputStream os = new FileOutputStream("saida.txt")) {
		
		String s = "texto escrito com sucesso!!";
		
		byte[] buffer = s.getBytes();
		
		os.write(buffer);
		
		}

	}

}
