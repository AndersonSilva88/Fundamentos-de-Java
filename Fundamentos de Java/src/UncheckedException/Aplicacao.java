package UncheckedException;

public class Aplicacao {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Object o1 = new Object();
		Object o2 = new Object();
		
		boolean iguais = Comparador.comparar(null, o2);
		System.out.println(iguais);
			 
	}

}
