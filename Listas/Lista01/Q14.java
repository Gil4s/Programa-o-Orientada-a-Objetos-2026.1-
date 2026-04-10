/*14. Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma que n > 0.  */
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero. ");
        int n = input.nextInt();
        
        int a = 0, b = 1;
         for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}
