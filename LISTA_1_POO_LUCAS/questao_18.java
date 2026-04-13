package LISTA_1_POO_LUCAS;
import java.util.Scanner;
public class questao_18{

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        int base, expoente;

        // vamos trabalhar somente com inteiros para facilitar a nossa vida
        System.out.println("Digite os seguintes valores para fazeremos a sua operação de potência: ");
        System.out.print("BASE: "); base = scanner.nextInt();
        System.out.print("EXPOENTE: "); expoente = scanner.nextInt();

        if (expoente > 0){

        int resultado = fun_18(base, expoente);
        result(resultado);
        scanner.close();

        } else {
            System.out.println("Não trabalhamos com valores de expoentes menores que 0");
        }

    }

    public static int fun_18(int x, int y){
        // perceba qu eo Math.pow para ser trabalhado com inteiros, precisamos configurar ele em conjunto
        // (int)
        int aux = (int) Math.pow(x,y);
        return aux;
    }

    public static void result( int value ) {

        System.out.println("Resultado: " + value);
    }

}
