package exercicio7;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
        Agenda agenda = new Agenda();
        Compromisso compromisso1  = new Compromisso("01-04-2024", "10:00", "Reunião de equipe");
        Compromisso compromisso2  = new Compromisso("30-03-2024", "15:00", "Prova Faculdade");
        Compromisso compromisso3  = new Compromisso("02-04-2024", "13:30", "Almoço com cliente");
        
        agenda.adicionarCompromisso(compromisso1);
        agenda.adicionarCompromisso(compromisso2);
        agenda.adicionarCompromisso(compromisso3);

        
        List<Compromisso> compromissosNoDia = agenda.getCompromissosPorData("01-04-2024");
        System.out.println("Compromissos para 01-04-2024:");
        for (Compromisso compromisso : compromissosNoDia) {
            System.out.println(compromisso);
        }
    }

}
