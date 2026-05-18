public class Teste {

    public static void main (String [] args) {

        Funcionario funcionario = new Funcionario("Guilherme" , 2000);

        funcionario.aumentar_salario(2000);
        System.out.println("Ganho anual: " + funcionario.GanhoAnual());
        System.out.println(funcionario.toString());

    }


}