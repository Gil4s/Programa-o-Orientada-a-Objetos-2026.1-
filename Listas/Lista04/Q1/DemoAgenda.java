/*
  1. Crie uma classe EntradaEmAgenda que contenha:
     - os dados necessarios para armazenar uma entrada de agenda (hora, dia, mes, ano e assunto);
     - um construtor;
    - um metodo toString;
     - um metodo ehNoDia que recebe valores de dia, mes e ano e retorna true se o dia,
       mes e ano daquela instancia da classe forem iguais aos argumentos passados.
 
  Crie tambem uma classe Agenda que:
     - encapsule uma agenda de compromissos representada por um ArrayList de instancias
       da classe EntradaEmAgenda;
     - implemente um metodo construtor;
     - possua um metodo para adicionar um novo compromisso a lista de compromissos;
     - tenha um metodo listaDia que recebe valores de dia, mes e ano e lista todas as
       instancias de EntradaEmAgenda que caem naquele dia, mes e ano.
 
  Por fim, escreva uma classe executavel que crie uma Agenda, adicione a ela 2 compromissos
 e, usando o metodo listaDia, liste as entradas da agenda que tem a mesma data do seu aniversario.
*/
public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Adicionando compromissos na agenda
        agenda.adicionaCompromisso(new EntradaEmAgenda(14, 15, 3, 2000, "Consulta medica"));
        agenda.adicionaCompromisso(new EntradaEmAgenda(19, 18, 12, 2003, "Jantar aniversario"));
        agenda.adicionaCompromisso(new EntradaEmAgenda(10, 20, 4, 2025, "Reuniao trabalho"));

        // Lista apenas os compromissos do dia do aniversario 
        agenda.listaDia(18, 12, 2003);
    }
}
