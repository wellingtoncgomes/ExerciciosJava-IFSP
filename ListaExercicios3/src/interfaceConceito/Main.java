package interfaceConceito;

public class Main {

	public static void main(String[] args) {

		// 1) Crie uma interface DispositivoEletronico com métodos ligar() e desligar().
		// Em seguida,
		// crie duas classes, Televisao e Computador, que implementam a interface
		// DispositivoEletronico e implementam os métodos ligar() e desligar().
		
		Televisao televisao = new Televisao();
		Computador computador = new Computador();

		televisao.ligar();
		televisao.desligar();

		computador.ligar();
		computador.desligar();
	}

}
