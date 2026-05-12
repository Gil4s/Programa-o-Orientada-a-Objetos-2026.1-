/*
 * Questao 2:
 * Defina uma classe para conter informacoes sobre um funcionario de uma empresa
 * (classe Funcionario). Inclua entre os atributos o salario por hora trabalhada.
 * Implemente dois construtores: um que receba apenas o nome (salario padrao R$2,00/h)
 * e outro que receba o nome e o salario por hora. Implemente os demais metodos
 * que achar conveniente.
 */
public class TestaFuncionario {

    public static void main(String[] args) {

        // Construtor 1: apenas o nome
        Funcionario f1 = new Funcionario("Ana Lima");
        System.out.println(f1);
        System.out.println("Salario para 40h: R$" + f1.calcularSalarioTotal(40));

        System.out.println();

        // Construtor 2: nome + salario por hora
        Funcionario f2 = new Funcionario("Carlos Souza", 15.50);
        System.out.println(f2);
        System.out.println("Salario para 160h: R$" + f2.calcularSalarioTotal(160));
    }
}