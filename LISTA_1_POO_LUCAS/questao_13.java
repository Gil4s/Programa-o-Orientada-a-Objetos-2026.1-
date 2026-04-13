package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_13{

    public static void main (String [] args) {
        
        for (int i = 1; i <= 60; i++) {
            if (i < 10){
            // Veja que, se eu usar somente o "=" eu estaria atribuindop valor ao i ... eu quero compara ele com 0 e não atribuir valor a ele
            System.out.printf(" 0%d ", i);
            }else{
                System.out.printf(" %d ", i);
            }
            if (i % 10 == 0) {
                System.out.println("");
            }
        }

        

    }
}