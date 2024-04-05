package exercicio5;

public class Main {

	// Classe Polígono Crie uma classe abstrata Poligono com um método abstrato
	// area(). Em seguida, crie classes Retangulo, Circulo e Triangulo que
	// estendem a classe Poligono e implementam o método area(). Crie objetos
	// dessas classes e teste o método area().

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(5, 4);
		Circulo circulo = new Circulo(3);
		Triangulo triangulo = new Triangulo(6, 8);

		System.out.println("Área do retângulo: " + retangulo.area());
		System.out.println("Área do círculo: " + circulo.area());
		System.out.println("Área do triângulo: " + triangulo.area());
	}

}
