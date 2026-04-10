/*20.  Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de 
m e n é definido recursivamente como segue: 
• se n > m, retorne mdc(n, m); 
• se n = 0, retorne m; 
• senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão. */

import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor n: ");
        int n = input.nextInt();

        System.out.print("Digite um valor m: ");
        int m = input.nextInt();

        int resultado = mdc(n, m);

        System.out.println("mdc: " + resultado);

        input.close();
    }

    public static int mdc(int n, int m) {

        // garante que n <= m
        if (n > m) {
            return mdc(m, n);
        }

        // caso base
        if (n == 0) {
            return m;
        }

        // chamada recursiva
        return mdc(n, m % n);
    }
}
