package exercicio6;

public class ContaBancaria {
	private int numeroDaConta;
	private double saldo;

	public ContaBancaria(int numeroDaConta, double saldoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldoInicial;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.printf("Depósito de %.2f realizado com sucesso.%n", valor);
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.printf("Saque de %.2f realizado com sucesso.%n", valor);
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	public void verSaldo() {
		System.out.printf("Saldo atual da conta %d é %.2f %n", this.numeroDaConta, this.saldo);
	}

}
