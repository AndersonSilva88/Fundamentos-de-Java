package Modificadores;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria c = new ContaBancaria();

		int conta = c.getNumConta();
		double saldo = c.getSaldo();
		boolean ativa = c.isAtiva();
		
		
		System.out.println("Digite numero da conta ");
		conta = sc.nextInt();
		System.out.println("Conta Bancaria: " + conta);
		
		
	   
		sc.close();
	}

}
