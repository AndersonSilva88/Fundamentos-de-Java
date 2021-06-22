package TratamentoExcecoes;

public class Aplicacao {

	public static void main(String[] args) {
		/*
		ContaBancaria c = new ContaBancaria(1000);
		try {
			c.sacar(2000);
			System.out.println("Saque foi realizado com sucesso");
			
		} catch (Exception e) {
			System.out.println("Occoreu um erro no saque: " + e.getMessage());
		}
		
		System.out.println(c.getSaldo());
		*/
		
		Banco b = new Banco(); 
		try {
			b.realizarOperacao();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Você tentou sacar " + e.getValor() + ", mas só tem um saldo de " + e.getSaldo());
			
		} catch (ValorNegativoException e) {
			System.out.println("Voce tentou sacar um valor negativo de " + e.getValor());
		}
	}

}
