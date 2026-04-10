/*21. Crie uma função recursiva que verifique se um dado número é primo. */
import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = input.nextInt();

        if (ehPrimo(n, n - 1)) {
            System.out.println("Primo");
        } else {
            System.out.println("Nao Primo");
        }

        input.close();
    }

    // funcao recursiva
    public static boolean ehPrimo(int n, int i) {

        // caso base
        if (n < 2) return false;

        if (i == 1) return true;

        // se encontrar divisor
        if (n % i == 0) return false;

        // chamada recursiva
        return ehPrimo(n, i - 1);
    }
}
