package StringBuilder;

public class Aplicacao {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			s.append("X");
		}
		
		
		System.out.println(s);

	}

}
