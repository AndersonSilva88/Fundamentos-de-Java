package topico.variavel.estrutura;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		
	/*	int x = 0;
		
		while (true) {
			System.out.println(x);
			
			if(x == 10) {
				break;
			}
			x++;
		}*/
		

		/* int x = 0;
		
		do {
			System.out.println(x);
			x++;
			
		} while (x <= 10);
		*/
		
		int i;
		int j;
		
		for(i=0, j=10; i<10; i++, j--) {
			System.out.println(i + " - "+j);
		}
		
	}

}
