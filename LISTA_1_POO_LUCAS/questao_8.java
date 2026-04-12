package LISTA_1_POO_LUCAS;
import java.util.Scanner;
public class questao_8{

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        // setore
        int tipo = scanner.nextInt();
        String cod;

        // int eletro = 222 ;
        // int cama = 111 ;

        double valor;

        switch (tipo) {

            case 111: cod = "cama"; break;
                


            case 222: cod = "Eletro"; break;

            default: cod = "Setor inválido";

        }
        
    }
}