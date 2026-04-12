package LISTA_1_POO_LUCAS;
import java.util.Scanner;


public class questao_11{

    public static void main (String [] args) {

        double x_abs_1, y_ord_1, x_abs_2, y_ord_2;

        String horizontal, vertical ;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite os valores do primeiro ponto\nValor de X: ");
        x_abs_1 = scanner.nextDouble();
        System.out.println("Valor de Y: ");
        y_ord_1 = scanner.nextDouble();

        System.out.println ("Digite os valores do segundo ponto\nValor de X: ");
        x_abs_2 = scanner.nextDouble();
        System.out.println("Valor de Y: ");
        y_ord_2 = scanner.nextDouble();

        if ( x_abs_2 < x_abs_1 ) {
            horizontal = "ESQUERDA";
        } else if ( x_abs_2 > x_abs_1 ) {
            horizontal = "DIREITA";
        } else {
            horizontal ="Sem deslocamento horizontal";
        }

        if (y_ord_2 > y_ord_1 ) {
            vertical = "ACIMA";
        } else if ( y_ord_2 < y_ord_1 ) {
            vertical = "ABAIXO";
        } else {
            vertical ="Sem deslocamento vertical";
        }

        System.out.printf ("Seu ponto em relação a referencia está\nHorizontalmente: %s\nVerticalmente: %s", horizontal, vertical);
        

    }
}