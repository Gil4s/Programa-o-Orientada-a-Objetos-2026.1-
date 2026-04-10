package LISTA_1_POO_LUCAS; 
import java.util.Scanner;

public class questao_4{

    public static void main (String []args){

        System.out.println ("Digite o valor da temperatura atual do seu ambiente em graus: ");

        Scanner entrada = new Scanner(System.in);

        double temperatura, conversao_far; 

        temperatura = entrada.nextDouble();

        conversao_far = (temperatura * 1.8 ) + 32;

        System.out.printf("O valor da temperatura atual e  Fahrenheit: %.2f" , conversao_far);

        entrada.close();

        

        
    }
}