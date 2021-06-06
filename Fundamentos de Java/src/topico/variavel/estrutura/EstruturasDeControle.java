package topico.variavel.estrutura;

public class EstruturasDeControle {

	public static void main(String[] args) {
		
		/*int num = 10;
		
		if (num > 10) {
			System.out.println("o número é maior que 10");
		} else if (num < 10) {
			System.out.println("o número é menor que 10");
		} else {
			System.out.println("o número é 10");
		} */
		
		int num = 10;
		
		switch (num) {
		case 5:  
			System.out.println("o número é 5");
			break;
		case 10:
			System.out.println("o número é 10");
			break;
		case 15:
			System.out.println("o número é 15");
			break;
		default:
			System.out.println("o número é outro ");
			break;
		}

	}

}
