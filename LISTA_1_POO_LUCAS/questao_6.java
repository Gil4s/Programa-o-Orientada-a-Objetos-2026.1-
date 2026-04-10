// Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_6{

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        // Precisamos dos valores em dias / horas / minutos

        // Vamos pedir para o usuário entrar com o valor da entrada que Lucas pediu na questão, só por questão de didática

        int minutos;

        System.out.println("Digite o valor em minutos teste: (para responder a questão, digite: 9257 minutos) "); 
        minutos = scanner.nextInt();

        int horas_minutadas = (minutos/60);
        int dias = horas_minutadas/24;

        int i = 0; while(horas_minutadas >= 24) {
            System.out.printf("calculando suas horas %d vezes", i);
            
            
            if (horas_minutadas >= 24) {
            horas_minutadas = (horas_minutadas-24);
            }

        i++;
        }
    
        int minutos_finais = minutos%60;

        System.out.println("O valor final da conversão é: " + dias + " " + horas_minutadas + " " + minutos_finais);

        scanner.close();

    }

    
}