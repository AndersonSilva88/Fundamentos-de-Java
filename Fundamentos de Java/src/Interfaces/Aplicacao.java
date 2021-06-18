package Interfaces;

public class Aplicacao {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		Rota rota = new Rota();
		
		rota.ir(c);
		
		Anel b = new Anel();
		
	    Vendedor v = new Vendedor();
		v.mostrarPreco(c);
		v.mostrarPreco(b);
		

	}

}
