
public class DemoTrio {
    public static void main(String[] args) {

        // Trio de inteiros - todos iguais
        Trio<Integer> t1 = new Trio<>(5, 5, 5);
        System.out.println("Trio de inteiros (todos iguais)");
        t1.imprime();

        // Trio de inteiros - dois iguais
        Trio<Integer> t2 = new Trio<>(5, 5, 3);
        System.out.println("Trio de inteiros (dois iguais)");
        t2.imprime();

        // Trio de Strings
        Trio<String> t3 = new Trio<>("ola", "ola", "tchau");
        System.out.println("Trio de Strings");
        t3.imprime();

        // Trio de doubles - nenhum igual
        Trio<Double> t4 = new Trio<>(1.1, 2.2, 3.3);
        System.out.println("Trio de doubles (nenhum igual)");
        t4.imprime();
    }
}
