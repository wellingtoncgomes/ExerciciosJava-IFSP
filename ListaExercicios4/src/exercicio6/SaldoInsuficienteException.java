package exercicio6;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar o saque.");
    }
}