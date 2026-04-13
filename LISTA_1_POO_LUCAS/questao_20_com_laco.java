//• se n > m, retorne mdc(n, m);
//• se n = 0, retorne m;
//• senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão. 

package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_20_com_laco{

    public static void main (String[]args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número para o MDC: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número para o MDC: ");
        int b = scanner.nextInt();

        int resultado = mdc(a,b);
        
        result(resultado);

        scanner.close();

    }

    public static int mdc(int x, int y) {
        int mdc = 1;
        // condições para o meu laço 
        // "PARA QUANDO MEU i FOR MENOR IGUAL A x E i MENOR IGUAL A y"
        for (int i = 1; (i <= x && i <= y); i++){
            if (x % i == 0 && y % i == 0){
                mdc = i;
            }
        }
        return mdc;
    }

    public static void result(int value) {

        System.out.println("O valor do MDC é: " + value);
    }
        

        
}