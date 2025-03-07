package tratamentoExcecao;

public class Livro {

	private int totalPaginas;

	public Livro(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public void lerPagina(int pagina) throws IllegalArgumentException {
		try {
			if (pagina < 1 || pagina > totalPaginas) {
				throw new IllegalArgumentException("Página inválida");
			}

			System.out.println("Lendo página " + pagina);

		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}