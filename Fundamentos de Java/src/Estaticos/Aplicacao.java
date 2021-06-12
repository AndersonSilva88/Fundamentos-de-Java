package Estaticos;

public class Aplicacao {

	public static void main(String[] args) {
		
//		Matematica m = new Matematica();
//		int soma = m.somar(10, 5);
//		int subtracao = m.subtrair(50, 10);
	
		int soma = Matematica.somar(10, 5);
		int subtracao = Matematica.subtrair(50, 10);
		
		System.out.println(soma);
		System.out.println(subtracao);

		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		System.out.println(Contador.getValor());	
		
		double media = Constantes.MEDIA;
		System.out.println(media);
		
		
	}

}
