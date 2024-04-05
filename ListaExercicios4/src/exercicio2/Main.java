package exercicio2;

public class Main {

	public static void main(String[] args) {
		
		// 2. Classe Estudante Crie uma classe Estudante com os atributos nome, idade e
		// nota. Adicione um método aprovado() que retorna verdadeiro se a nota for
		// maior
		// ou igual a 7 é falso caso contrário. Crie um objeto da classe Estudante,
		// atribui
		// valores aos atributos e chame o método aprovado() para verificar se o
		// estudante
		// foi aprovado ou não.
		
		 Estudante estudante1 = new Estudante("João", 20, 8.5);
		 Estudante estudante2 = new Estudante();
		 
		 estudante2.setIdade(23);
		 estudante2.setNome("Pedro");
		 estudante2.setNota(5.0);
	        
	        if (estudante1.aprovado()) {
	            System.out.println(estudante1.getNome() + " foi aprovado!");
	        } else {
	            System.out.println(estudante1.getNome() + " foi reprovado.");
	        }
	       
	        if (estudante2.aprovado()) {
	            System.out.println(estudante2.getNome() + " foi aprovado!");
	        } else {
	            System.out.println(estudante2.getNome() + " foi reprovado.");
	        }


	}

}
