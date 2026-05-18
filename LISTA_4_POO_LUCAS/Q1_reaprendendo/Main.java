import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Agenda agenda1 = new Agenda();

        agenda1.addCompromisso(new EntradaEmAgenda(11, 18, 7, 2000, "resolvendo a questao 1")); // lembrar de tirar os 0s a esquerda
        agenda1.addCompromisso(new EntradaEmAgenda(11, 18, 7, 2000, "resolvendo a questao 1")); // lembrar de tirar os 0s a esquerda

        agenda1.listaDia(18, 7, 2000); // lembrar de tirar os 0s a esquerda

    }
}