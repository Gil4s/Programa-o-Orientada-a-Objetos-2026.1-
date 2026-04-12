package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_7{

    public static void main(String[] args) {

        double n1, n2, n3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número:");
        n1 = scanner.nextDouble();

        System.out.println("Digite o valor do segundo número:");
        n2 = scanner.nextDouble();

        System.out.println("Digite o valor do terceiro número:");
        n3 = scanner.nextDouble();

        double maior, meio, menor;

        // Lógica de Comparação
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        scanner.close();

        System.out.printf("O Valor em ordem dos seus números é:%n");
        System.out.printf("Maior: %.2f%nMeio:  %.2f%nMenor: %.2f%n", maior, meio, menor);
    }
}
