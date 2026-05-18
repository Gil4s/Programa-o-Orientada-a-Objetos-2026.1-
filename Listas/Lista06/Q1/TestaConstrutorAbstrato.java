/*
 * Questao 1:
 * Explique por que nao podemos ter construtores declarados com a palavra-chave abstract.
 */

/*
 * RESPOSTA:
 *
 * Um construtor e chamado no momento em que um objeto e criado com 'new'.
 * A palavra-chave 'abstract' existe justamente para forcar que subclasses
 * fornecam a implementacao de um metodo — ou seja, ela implica que o metodo
 * NAO tem corpo na classe onde e declarado.
 *
 * Essas duas ideias sao contraditórias por dois motivos:
 *
 * 1. Classes abstratas nao podem ser instanciadas:
 *    Se nao podemos usar 'new' em uma classe abstrata, seu construtor
 *    nunca seria chamado diretamente. Torna-lo 'abstract' seria redundante
 *    e sem sentido, pois nenhum objeto seria criado para "usar" esse construtor.
 *
 * 2. 'abstract' exige sobrescrita; construtores nao sao herdados:
 *    Metodos abstratos precisam ser SOBRESCRITOS (overridden) nas subclasses.
 *    Contudo, construtores nao sao herdados em Java — cada classe define
 *    os seus proprios. Logo, nao ha como "sobrescrever" um construtor.
 *    A subclasse nao reimplementa o construtor da mae; ela define o seu proprio
 *    e pode chamar o da mae via super().
 *
 * Em resumo: 'abstract' significa "sem implementacao, obrigatorio nas filhas",
 * mas construtores (a) nao sao herdados e (b) so fazem sentido quando
 * um objeto e criado — o que nao ocorre em classes abstratas diretamente.
 * Por isso o compilador Java simplesmente proibe a combinacao 'abstract' + construtor.
 *
 * Exemplo que o compilador REJEITA (apenas para ilustracao, nao compila):
 *
 *   public abstract class Exemplo {
 *       public abstract Exemplo(); // ERRO: illegal combination of modifiers
 *   }
 *
 * O correto e: uma classe abstrata PODE (e normalmente deve) ter construtores
 * concretos, chamados pelas subclasses via super():
 *
 *   public abstract class Exemplo {
 *       private String nome;
 *       public Exemplo(String nome) {   // construtor concreto — valido
 *           this.nome = nome;
 *       }
 *   }
 */
public class TestaConstrutorAbstrato {

    // Classe abstrata com construtor concreto (forma correta)
    abstract static class Forma {
        private String cor;

        // Construtor concreto em classe abstrata: valido e comum.
        // Subclasses o chamam via super(cor).
        public Forma(String cor) {
            this.cor = cor;
        }

        public String getCor() {
            return cor;
        }

        // Metodo abstrato: sem corpo, obriga subclasses a implementar
        public abstract double area();
    }

    // Subclasse concreta que chama o construtor da mae via super()
    static class Quadrado extends Forma {
        private double lado;

        public Quadrado(String cor, double lado) {
            super(cor); // chama o construtor de Forma
            this.lado = lado;
        }

        @Override
        public double area() {
            return lado * lado;
        }
    }

    public static void main(String[] args) {
        // Nao podemos fazer: new Forma("azul") — classe abstrata!
        // Mas podemos criar subclasses concretas:
        Quadrado q = new Quadrado("azul", 5.0);

        System.out.println("=== Questao 1: Construtores e abstract ===");
        System.out.println();
        System.out.println("Construtores NAO podem ser abstract porque:");
        System.out.println("  1. Classes abstratas nao sao instanciadas diretamente,");
        System.out.println("     entao um construtor abstract nunca seria chamado via 'new'.");
        System.out.println("  2. Construtores nao sao herdados, logo nao podem ser");
        System.out.println("     'sobrescritos' como exige a palavra-chave abstract.");
        System.out.println();
        System.out.println("Demonstracao do uso correto:");
        System.out.println("  Quadrado criado com cor='" + q.getCor() + "' e lado=5.0");
        System.out.println("  Area: " + q.area());
        System.out.println("  O construtor de Forma foi chamado via super() — sem abstract!");
    }
}