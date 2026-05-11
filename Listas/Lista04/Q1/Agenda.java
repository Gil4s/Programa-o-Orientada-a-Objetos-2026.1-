import java.util.ArrayList;

public class Agenda {

    // ArrayList que armazena todos os compromissos da agenda
    private ArrayList<EntradaEmAgenda> compromissos;

    // Construtor que inicializa a lista de compromissos vazia
    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    // Adiciona um novo compromisso a lista
    public void adicionaCompromisso(EntradaEmAgenda entrada) {
        compromissos.add(entrada);
    }

    // Percorre a lista e imprime todas as entradas que caem no dia, mes e ano informados
    public void listaDia(int dia, int mes, int ano) {
        System.out.println("Compromissos do dia " + dia + "/" + mes + "/" + ano + ":");
        for (int i = 0; i < compromissos.size(); i++) {
            EntradaEmAgenda entrada = compromissos.get(i);
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada.toString());
            }
        }
    }
}
