package exercicio2;

public class Estudante {
	
	private String nome;
	private int idade;
	private double nota;
	
	public Estudante() {
		
	}

	public Estudante(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	public boolean aprovado() {
		return nota >= 7.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
