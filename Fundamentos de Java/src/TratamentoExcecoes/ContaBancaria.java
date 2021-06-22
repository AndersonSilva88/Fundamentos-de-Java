package TratamentoExcecoes;

public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	/*
	public void sacar(double valor) throws Exception {
		if (valor <= 0) {
			throw new Exception("o valor para saque é negativo");
		}
		if (saldo - valor < 0) {
			throw new Exception("o saldo é insuficiente");
		} 
		
		this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
	
	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		if (valor <= 0) {
			throw new ValorNegativoException(valor);
		}
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException(valor, saldo);
		} 
		
		this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	

}
