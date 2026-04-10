package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_5_organizada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o número de 3 dígitos
        System.out.print("Digite um número de 3 dígitos (CDU): ");
        int numeroOriginal = scanner.nextInt();

        // Extraindo os dígitos usando operadores aritméticos
        // Exemplo: 123
        // A ideia aqui é o seguinte
        // Vamos pegar o resto da divisão referente a valores que eu consiga converter separadamente cada algarísmo em seus respectivos pesos
        int centena = numeroOriginal / 100;          // 123 / 100 = 1
        int dezena = (numeroOriginal % 100) / 10;    // (123 % 100) = 23 -> 23 / 10 = 2
        int unidade = numeroOriginal % 10;           // 123 % 10 = 3

        // Remontando no formato UCD (Unidade, Centena, Dezena)
        // 3 * 100 + 1 * 10 + 2 = 312
        int numeroInvertido = (unidade * 100) + (centena * 10) + dezena;

        // Exibindo os resultados
        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
        System.out.println("Número invertido (UCD): " + numeroInvertido);

        scanner.close();
    }
}