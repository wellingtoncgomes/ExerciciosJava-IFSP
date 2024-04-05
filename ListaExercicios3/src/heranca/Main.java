package heranca;

public class Main {

	public static void main(String[] args) {

		// 1) Crie uma classe Planta com um método fotossintese(). Em seguida, crie duas
		// classes,
		// Flor e Arvore, que herdam de Planta e sobrescrevem o método fotossintese().

		Planta planta = new Planta();
		Flor flor = new Flor();
		Arvore arvore = new Arvore();

		planta.fotossintese();
		flor.fotossintese();
		arvore.fotossintese();
	}

}
