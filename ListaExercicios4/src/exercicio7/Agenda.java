package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Compromisso> compromissos;

	public Agenda() {
		this.compromissos = new ArrayList<>();
	}

	public void adicionarCompromisso(Compromisso compromisso) {
		compromissos.add(compromisso);
	}

	public List<Compromisso> getCompromissosPorData(String data) {
		List<Compromisso> compromissosNaData = new ArrayList<>();
		for (Compromisso compromisso : compromissos) {
			if (compromisso.getData().equals(data)) {
				compromissosNaData.add(compromisso);
			}
		}
		return compromissosNaData;
	}
}
