package exercicio5;

public class Circulo extends Poligono{
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double area() {
		return Math.PI * raio * raio;
	}

}
