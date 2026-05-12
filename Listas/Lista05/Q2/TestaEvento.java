/*
 * Questao 2
 * Crie uma classe para representar uma data e um horario (DataHora).
 * Escreva uma classe EventoDelegacao que seja baseada na classe DataHora e que
 * contenha um campo para indicar qual o evento que ela representa. Use o
 * mecanismo de delegacao para criar a classe EventoDelegacao.
 * Escreva uma classe EventoHeranca que seja baseada na classe DataHora e que
 * contenha um campo para indicar qual o evento que ela representa. Use o
 * mecanismo de heranca para criar a classe EventoHeranca.
 * Escreva um aplicativo de teste que demonstre o uso das classes criadas.
 */

public class TestaEvento {
    public static void main(String[] args) {

        // testando com delegacao
        EventoDelegacao ed = new EventoDelegacao("Reuniao de equipe", 15, 5, 2026, 14, 30);
        System.out.println("=== Delegacao ===");
        System.out.println(ed);

        // testando com heranca
        EventoHeranca eh = new EventoHeranca("Apresentacao do projeto", 20, 6, 2026, 9, 0);
        System.out.println("\n=== Heranca ===");
        System.out.println(eh);
    }
}