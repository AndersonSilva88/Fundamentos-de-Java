package TratamentoExcecoes;

public class Banco {

	public void realizarOperacao() throws SaldoInsuficienteException, ValorNegativoException{
		
		ContaBancaria c = new ContaBancaria(1000);
		
			c.sacar(1500);
			System.out.println("Saque foi realizado com sucesso");
			
		    System.out.println(c.getSaldo());
	}
}
