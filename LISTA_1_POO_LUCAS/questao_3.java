package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_3 {

    public static void main (String []args){
        Scanner entrada = new Scanner (System.in);

        double angulo, seno, cosseno, tangente, angulo_radianos;

        double pi = Math.PI;

        System.out.println("Digite o valor do ângulo em graus");

        angulo = entrada.nextDouble();

        angulo_radianos = angulo * (3.14/180);

        cosseno = Math.cos(angulo_radianos);

        seno = Math.sin(angulo_radianos);

        tangente = Math.tan(angulo_radianos);

        // criar condicional para não calcular a tangente

        System.out.printf("Cosseno: %.2f , Seno: %.2f , Tangente: %.2f ", seno, cosseno, tangente); 

        entrada.close();


        

    }
}