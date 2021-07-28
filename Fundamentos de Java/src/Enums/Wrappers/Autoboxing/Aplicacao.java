package Enums.Wrappers.Autoboxing;

public class Aplicacao {

	public static void main(String[] args) {
		
		DiaDaSemana hoje = DiaDaSemana.QUARTA;
		
		int num = DiaDaSemana.QUARTA.getNum();
		
		System.out.println(num);
		
		String s = "TERCA";
		
		DiaDaSemana d = DiaDaSemana.valueOf(s);
		System.out.println(d.getNum());

	}

}
