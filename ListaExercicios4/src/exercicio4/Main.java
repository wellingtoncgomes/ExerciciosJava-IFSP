package exercicio4;

public class Main {

	public static void main(String[] args) {

		// 4. Classe ContaBancaria Crie uma classe ContaBancaria com os atributos
		// numeroDaConta e saldo. A classe deve ter métodos para depositar(),
		// sacar() e verSaldo(). O método depositar() deve adicionar o valor ao saldo,
		// o método sacar() deve subtrair o valor do saldo e o método verSaldo() deve
		// imprimir o saldo atual. Crie um objeto da classe ContaBancaria e teste os
		// métodos.

		ContaBancaria conta = new ContaBancaria(12345, 0);

		conta.depositar(1000);
		conta.verSaldo();

		conta.sacar(500);
		conta.verSaldo();

		conta.sacar(700);
		conta.verSaldo();
	}

}
