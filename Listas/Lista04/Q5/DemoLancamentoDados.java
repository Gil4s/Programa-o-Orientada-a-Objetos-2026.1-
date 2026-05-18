/*
  5. Escreva um aplicativo para simular o lancamento de dois dados. O aplicativo deve
     utilizar um objeto da classe Random, uma vez para lancar o primeiro dado e novamente
     para lancar o segundo dado. A soma dos dois valores deve entao ser calculada.
     Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores ira
     variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes.
     Seu aplicativo deve lancar o dado 36.000.000 vezes. Utilize um array unidimensional
     para contar o numero de vezes que cada possivel soma aparece. Exiba os resultados.
 */
import java.util.Random;

public class DemoLancamentoDados {
    public static void main(String[] args) {
        Random random = new Random();

        // Array de tamanho 13 para guardar as frequencias de cada soma (indices 2 a 12)
        // O indice 0 e 1 ficam sem uso para facilitar a leitura
        int[] frequencias = new int[13];

        int totalLancamentos = 36000000;

        // Lanca os dados 36 milhoes de vezes
        for (int i = 0; i < totalLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1; // gera de 1 a 6
            int dado2 = random.nextInt(6) + 1; // gera de 1 a 6
            int soma = dado1 + dado2;

            // Incrementa a frequencia da soma obtida
            frequencias[soma]++;
        }

        // Exibe os resultados
        System.out.println("=== Resultados apos " + totalLancamentos + " lancamentos ===");
        System.out.println();
        System.out.println("Soma | Frequencia | Porcentagem");
        System.out.println("----------------------------------");

        for (int soma = 2; soma <= 12; soma++) {
            double porcentagem = (double) frequencias[soma] / totalLancamentos * 100;
            System.out.printf("  %2d | %10d | %.2f%%%n", soma, frequencias[soma], porcentagem);
        }
    }
}