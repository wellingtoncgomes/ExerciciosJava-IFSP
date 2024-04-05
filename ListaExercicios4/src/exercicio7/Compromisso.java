package exercicio7;

public class Compromisso {
	
	private String data;
	private String hora;
	private String descricao;

	public Compromisso(String data, String hora, String descricao) {
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public String getHora() {
		return hora;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Data: " + data 
				+ ", Hora: " + hora 
				+ ", Descrição: " + descricao;
	}

}
