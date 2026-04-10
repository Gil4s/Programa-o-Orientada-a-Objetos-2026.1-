/* O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado 
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia 
da semana correspondente. 
• Exemplo de entrada: 10 
• Exemplo de saída: O dia 10 será uma terça-feira.  */
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Digite um numero do mes. ");
       int dia = input.nextInt();

       /*
       domingo, 1, 8, 15, 22
       segunda-feira, 2, 9, 16, 23
       terça-feira, 3, 10, 17, 24
       quarta-feira, 4, 11, 18, 25
       quinta-feira, 5, 12, 19, 26
       sexta-feira, 6, 13, 20, 27
       sabado, 7, 14, 21, 28
        */

        int resto = (dia - 1) % 7;

        switch (resto) {
            case 0: System.out.println("Domingo"); break;
            case 1: System.out.println("Segunda-feira"); break;
            case 2: System.out.println("Terca-feira"); break;
            case 3: System.out.println("Quarta-feira"); break;
            case 4: System.out.println("Quinta-feira"); break;
            case 5: System.out.println("Sexta-feira"); break;
            case 6: System.out.println("Sabado"); break;
        }

    } 
}
