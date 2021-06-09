package SobreCarga;

public class Aplicação {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		int soma = m.somar(35, 50);
		
		System.out.println(soma);
		
		double soma2 = m.somar(10.5, 45.4);
		System.out.println(soma2);
	}

}
