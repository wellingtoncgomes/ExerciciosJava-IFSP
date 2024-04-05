package tratamentoExcecao;

public class Main {

	public static void main(String[] args) {

		// 1) Crie uma classe Livro com um método lerPagina(int pagina). Este método
		// deve
		// lançar uma exceção se a página for menor que 1 ou maior que o número total de
		// páginas do livro.

		Livro livro = new Livro(15);

		livro.lerPagina(35);
		
		livro.setTotalPaginas(50);
		
		livro.lerPagina(35);

	}

}
