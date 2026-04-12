package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_12 {
    public static void main (String [] args){

        // a questão não mencionou se eu preciso tratar com o ano bissesto.
        // dito isso, vamos para os códigos normais
        // ele fala que o mês começa no domingo dia 1, logo, cenário perfeito

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um dia de fevereiro de 2015 (1 a 28):");
        int dia = scanner.nextInt();

        // Validando se o dia digitado está no intervalo correto
        if (dia < 1 || dia > 28) {
            System.out.println("Número inválido. Digite um dia entre 1 e 28.");
        } else {
            int resultado = dia % 7;
            String semana;

            switch (resultado) {
                case 0: semana = "sábado";
                break;
                case 1: semana = "domingo";
                break;
                case 2: semana = "segunda-feira";
                break;
                case 3: semana = "terça-feira";
                break;
                case 4: semana = "quarta-feira";
                break;
                case 5: semana = "quinta-feira";
                break;
                case 6: semana = "sexta-feira";
                break;
                default: semana = "Tente novamente"; 
            }

            System.out.printf("O dia %d será uma %s.", dia, semana);
        }
        
        scanner.close(); // Boa prática!
    }
}