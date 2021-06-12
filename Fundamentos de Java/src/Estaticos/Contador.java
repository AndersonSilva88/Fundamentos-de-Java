package Estaticos;

public class Contador {

	private static int valor;
	
	public Contador() {
		valor = 1;
	}
	
	public static void incrementar() {
		valor++;
	}
	
	public static int getValor() {
		return valor;
	}
}
