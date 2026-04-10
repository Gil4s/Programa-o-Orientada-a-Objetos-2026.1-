/*Escreva um programa que receba uma temperatura em graus centígrados e a apresente 
em graus Fahrenheit. */

import java.util.Scanner;

public class Q4 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.err.println("Digite a temperatura em graus centigrados.");
    double centigrados = input.nextDouble();
    
    double Fahrenheit = (centigrados * 1.8) + 32;           //°F = (°C x 1.8) + 32

    System.err.println("Temperatura em Fahrenheit: " + Fahrenheit);

   } 
}
