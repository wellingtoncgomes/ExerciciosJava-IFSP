package exercicio6;

public class Main {

	public static void main(String[] args) {

		// 2. Classe Conta Bancária com Exceções Modifique a classe ContaBancaria do
		// exercício anterior para lançar uma exceção personalizada
		// SaldoInsuficienteException quando uma tentativa de saque é feita, mas o
		// saldo é insuficiente. Teste a classe com um programa que tente fazer um saque
		// maior que o saldo disponível.

		ContaBancaria conta = new ContaBancaria(12345, 0);

		conta.depositar(1000);
		conta.verSaldo();

		try {
			conta.sacar(2000);
			conta.verSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.print("Erro: " + e.getMessage());
		}

		try {
			conta.sacar(500);
			conta.verSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.print("Erro: " + e.getMessage());
		}
	}
}
