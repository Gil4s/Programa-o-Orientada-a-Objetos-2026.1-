
/*5.Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena, 
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma 
variável de tipo inteiro. Por fim, reescreva o número no formato UCD em outra variável 
de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312.  */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero de 3 digitos.");
        int num = input.nextInt();

        int Centena = num /100;
        int Dezena = (num /10) % 10;
        int Unidade = num % 10;
        
        System.out.println( "Numero no formato UDC: " + Unidade + Centena + Dezena);
    }
}
