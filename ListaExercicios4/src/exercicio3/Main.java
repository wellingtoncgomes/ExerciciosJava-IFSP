package exercicio3;

public class Main {

	// 3. Classe Livro Crie uma classe Livro com os atributos titulo, autor e
	// anoDePublicacao. Adicione um método imprimirDetalhes() que imprime
	// todos os detalhes do livro. Crie um objeto da classe Livro, atribua valores
	// aos
	// atributos e chame o método imprimirDetalhes().

	public static void main(String[] args) {

		Livro meuLivro = new Livro("Aventuras de Sherlock Holmes", "Arthur Conan Doyle", 1892);
		Livro outroLivro = new Livro();

		outroLivro.setTitulo("O leão, a feiticeira e o guarda-roupa");
		outroLivro.setAutor("Clive Staples Lewis");
		outroLivro.setAnoDePublicacao(1949);

		meuLivro.imprimirDetalhes();
		System.out.println("===========================");
		outroLivro.imprimirDetalhes();
	}

}
