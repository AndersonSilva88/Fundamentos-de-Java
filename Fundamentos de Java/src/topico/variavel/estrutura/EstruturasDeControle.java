package topico.variavel.estrutura;

public class EstruturasDeControle {

	public static void main(String[] args) {
		
		/*int num = 10;
		
		if (num > 10) {
			System.out.println("o n�mero � maior que 10");
		} else if (num < 10) {
			System.out.println("o n�mero � menor que 10");
		} else {
			System.out.println("o n�mero � 10");
		} */
		
		int num = 10;
		
		switch (num) {
		case 5:  
			System.out.println("o n�mero � 5");
			break;
		case 10:
			System.out.println("o n�mero � 10");
			break;
		case 15:
			System.out.println("o n�mero � 15");
			break;
		default:
			System.out.println("o n�mero � outro ");
			break;
		}

	}

}
