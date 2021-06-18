package Interfaces;

public class Carro implements Gol, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Carro  virou á esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Carro virou à direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Carro acelerou");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Gol abriu a porta");
		
	}

	
	@Override
	public double getPreco() {
		return 590000;
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
