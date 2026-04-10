/*7.Escreva um programa que lê três números e determina qual número é o menor.  */
 import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o primeiro numero.");
    double num1 = input.nextDouble();
    
    System.out.println("Digite o segundo numero.");
    double num2 = input.nextDouble();

    System.out.println("Digite o terceiro numero.");
    double num3 = input.nextDouble();
     if (num1 < num2 && num1 <num3) {
        System.out.println("Menor numero: " + num1);
        
     }
     else if (num2 < num1 && num2 <num3) {
         System.out.println("Menor numero: " + num2);
     }
     else{
         System.out.println("Menor numero: " + num3);
     }
    }
}
