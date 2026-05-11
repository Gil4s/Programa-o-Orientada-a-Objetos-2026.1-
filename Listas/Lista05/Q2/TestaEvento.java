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