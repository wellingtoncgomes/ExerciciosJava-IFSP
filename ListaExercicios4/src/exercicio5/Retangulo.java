package exercicio5;

public class Retangulo extends Poligono {
	
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double area() {
        return ladoA * ladoB;
    }
}
