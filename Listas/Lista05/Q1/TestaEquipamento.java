/*
 * Questao 1
 * Crie as classes Equipamento e Computador, cada uma com dois atributos privados
 * a sua escolha. Alem disso, a classe Computador devera herdar os metodos e
 * atributos da classe Equipamento. Escreva metodos de acesso, gets e sets, para
 * os atributos definidos em ambas as classes. Cada classe tambem deve ter um
 * metodo toString. Lembre-se que o metodo toString de Computador tambem deve
 * representar os atributos herdados. Por fim, crie uma classe executavel,
 * TestaEquipamento, para instanciar um objeto de cada classe, inicializar seus
 * atributos e imprimi-los.
 */

public class TestaEquipamento {
    public static void main(String[] args) {

        // Instância de Equipamento — usa apenas os atributos da classe base
        Equipamento e = new Equipamento("Samsung", 2020);
        System.out.println("=== Equipamento ===");
        System.out.println(e); // chama automaticamente o toString() de Equipamento

        // Instância de Computador — recebe os 4 atributos (2 do pai + 2 próprios)
        // internamente, super(marca, anoFabricacao) cuida dos atributos herdados
        Computador c = new Computador("Dell", 2023, "Intel i7", 16);
        System.out.println("\n=== Computador ===");
        System.out.println(c); // chama o toString() de Computador, que já inclui o do pai
    }
}