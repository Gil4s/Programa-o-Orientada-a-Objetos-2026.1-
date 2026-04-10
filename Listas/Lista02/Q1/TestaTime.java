

public class TestaTime {
    public static void main(String[] args) {
        Time t1 = new Time("Flamengo", "Rio de Janeiro");
        Time t2 = new Time("Corinthians", "Sao Paulo");

        // Simulando rodadas
        t1.registraVitoria();
        t2.registraDerrota();

        t1.registraEmpate();
        t2.registraEmpate();

        t1.registraVitoria();
        t2.registraDerrota();

        // Mostrando dados
        t1.mostraDados();
        System.out.println();
        t2.mostraDados();

        // Comparando pontos
        System.out.println("\nClassificacao:");
        if (t1.calculaPontos() > t2.calculaPontos()) {
            System.out.println(t1.nome + " esta na frente com " + t1.calculaPontos() + " pontos!");
        } else {
            System.out.println(t2.nome + " esta na frente com " + t2.calculaPontos() + " pontos!");
        }
    }
}