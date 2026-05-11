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