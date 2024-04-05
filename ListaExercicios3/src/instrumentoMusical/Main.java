package instrumentoMusical;

public class Main {

	public static void main(String[] args) {

		// 2) Crie uma classe abstrata InstrumentoMusical com métodos abstratos tocar()
		// e afinar().
		// Em seguida, crie duas classes, Violao e Piano, que herdam de
		// InstrumentoMusical e
		// implementam os métodos tocar() e afinar().
		
		Violao violao = new Violao();
		Piano piano = new Piano();

		violao.tocar();
		violao.afinar();

		piano.tocar();
		piano.afinar();
	}

}
