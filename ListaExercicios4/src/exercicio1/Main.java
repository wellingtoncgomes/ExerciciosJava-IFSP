package exercicio1;

public class Main {

	public static void main(String[] args) {

		// Nível Básico
		// 1. Classe Calculadora Crie uma classe Calculadora com métodos para as quatro
		// operações básicas: somar(), subtrair(), multiplicar() e dividir(). Cada
		// método deve receber dois parâmetros e retornar o resultado da operação. Crie
		// um
		// objeto da classe Calculadora e teste os métodos.

		Calculadora calculadora = new Calculadora();

		System.out.println("Soma: " + calculadora.somar(10, 5));
		System.out.println("Subtração: " + calculadora.subtrair(10, 5));
		System.out.println("Multiplicação: " + calculadora.multiplicar(10, 5));
		try {
			double resultado = calculadora.dividir(10, 0);
			System.out.println("Resultado: " + resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		try {
			double resultado = calculadora.dividir(10, 5);
			System.out.println("Resultado: " + resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
