/*
 * Questao 4
 * Crie uma classe Pessoa com ao menos 2 atributos a sua escolha. Escreva a
 * classe Politico que herda da classe Pessoa e tem um campo adicional para
 * representar o partido do politico. Escreva tambem as classes Prefeito e
 * Governador que herdam da classe Politico e que contem um campo para
 * representar a cidade ou estado governado. Todos os atributos devem ser
 * privados. Cada classe deve ter um construtor e um metodo toString. Lembre-se
 * que cada metodo toString deve representar todos os atributos, inclusive os
 * herdados. Escreva tambem uma aplicacao que demonstre o uso de instancias
 * destas classes.
 */

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