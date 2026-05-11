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