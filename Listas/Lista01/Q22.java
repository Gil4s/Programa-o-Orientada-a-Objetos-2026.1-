/* Dado um polinômio 
        Pn(x) = a0xn + a1xn−1 + · · · + an−1x + an (1) 
este pode ser definido recursivamente como 
        Pn(x) = xPn−1(x) + an (2) 
Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0, · · · , an e o valor 
x devem ser solicitados ao usuário na função main.  */
 
import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o grau do polinomio (n): ");
        int n = input.nextInt();

        double[] a = new double[n + 1];

        // lendo coeficientes
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            a[i] = input.nextDouble();
        }

        System.out.print("Digite o valor de x: ");
        double x = input.nextDouble();

        double resultado = polinomio(a, n, x);

        System.out.println("Resultado: " + resultado);

        input.close();
    }

    // funcao recursiva
    public static double polinomio(double[] a, int n, double x) {

        // caso base
        if (n == 0) {
            return a[0];
        }

        // chamada recursiva (formula dada)
        return x * polinomio(a, n - 1, x) + a[n];
    }
}
