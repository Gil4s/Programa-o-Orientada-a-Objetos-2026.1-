public class TestaPolitico {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Carlos Silva", 45);
        System.out.println("=== Pessoa ===");
        System.out.println(p);

        Politico pol = new Politico("Ana Souza", 52, "PX");
        System.out.println("\n=== Politico ===");
        System.out.println(pol);

        Prefeito pref = new Prefeito("Joao Lima", 48, "PY", "Pau dos Ferros");
        System.out.println("\n=== Prefeito ===");
        System.out.println(pref);

        Governador gov = new Governador("Maria Oliveira", 55, "PZ", "Rio Grande do Norte");
        System.out.println("\n=== Governador ===");
        System.out.println(gov);
    }
}