/*
 * Questao 5
 * Implemente a classe Funcionario com nome, salario e os metodos:
 * aumentarSalario: recebe o valor do aumento e o adiciona ao salario;
 * ganhoAnual: computa o valor recebido em 12 meses e o 13o;
 * toString: retorna uma representacao textual de um objeto de Funcionario.
 * Crie tambem a classe Assistente, que tambem e um funcionario e que possui
 * um numero de matricula e seus metodos de acesso, alem de um metodo toString.
 * Escreva as classes Tecnico e Administrativo:
 * - Ambas sao filhas da classe Assistente e devem ter um metodo ganhoAnual;
 * - Assistentes Tecnicos possuem um bonus salarial;
 * - Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
 *   de turno. O 13o nao possui adicional noturno, mas pode possuir bonus
 *   salarial (se aplicavel).
 */

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Pedro Costa", 3000.0);
        System.out.println("=== Funcionario ===");
        System.out.println(f);
        System.out.println("Ganho Anual: R$" + f.ganhoAnual());

        Assistente a = new Assistente("Lucas Melo", 2500.0, 1001);
        System.out.println("\n=== Assistente ===");
        System.out.println(a);
        System.out.println("Ganho Anual: R$" + a.ganhoAnual());

        Tecnico t = new Tecnico("Fernanda Lima", 3500.0, 1002, 500.0);
        System.out.println("\n=== Tecnico ===");
        System.out.println(t);
        System.out.println("Ganho Anual: R$" + t.ganhoAnual());

        Administrativo adm = new Administrativo("Bruno Alves", 2800.0, 1003, "noite", 400.0);
        System.out.println("\n=== Administrativo ===");
        System.out.println(adm);
        System.out.println("Ganho Anual: R$" + adm.ganhoAnual());

        // testando aumentarSalario
        System.out.println("\n=== Aumento de Salario ===");
        f.aumentarSalario(500.0);
        System.out.println("Novo salario de " + f.getNome() + ": R$" + f.getSalario());
    }
}