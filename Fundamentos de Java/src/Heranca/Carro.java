package Heranca;

public class Carro extends Veiculo {
	
	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	@Override
	public void buzinar() {
		System.out.println("Carro Buzinando");
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Quatro Portas: " + quatroPortas);
	}
	
}
