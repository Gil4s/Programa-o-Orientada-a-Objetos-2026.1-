/*Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 
valores reais serão informados pelo usuário.  */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o primeiro numero.");
    double num1 = input.nextDouble();
    
    System.out.println("Digite o segundo numero.");
    double num2 = input.nextDouble();

    System.out.println("Digite o terceiro numero.");
    double num3 = input.nextDouble();

    double media = ((num1 + num2 + num3)/3);
    
    System.out.println("Media: " + media);


    }
}
