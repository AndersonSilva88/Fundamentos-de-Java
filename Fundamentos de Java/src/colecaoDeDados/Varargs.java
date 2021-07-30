package colecaoDeDados;

public class Varargs {

	public static void main(String[] args) {
	
		imprimir("A");
		imprimir("a", "b", "c");
	}
	
	public static void imprimir(String... textos) {
		for (int i = 0; i < textos.length; i++) {
			System.out.println(textos[i]);
		}
	}
}
