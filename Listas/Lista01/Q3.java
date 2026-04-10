/*3.Escreva um programa que receba um ângulo em graus e o converta para sua represen- 
tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e 
cotangente do ângulo. */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o angulo em Graus.");
        double graus = input.nextDouble();
        double rad = Math.toRadians(graus);
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double tangente = Math.tan(rad);

        double cossecante = 1/seno;
        double secante = 1/cosseno;
        double cotangente = 1/ tangente; 

        System.out.println("Radianos: " + rad);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);
    
    }
}
