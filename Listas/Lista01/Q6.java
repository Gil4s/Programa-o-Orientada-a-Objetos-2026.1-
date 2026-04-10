/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos 
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e 
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos. */

import java.util.Scanner;

public class Q6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o intervalo em minutos:");
    int intervaloMin = input.nextInt();

    int dias = intervaloMin/(24*60);
    int resto = intervaloMin % (24*60) ;
    int horas = (resto / 60);
    int minutos = (resto % 60);

    System.out.println(dias + " dias, " + horas + " horas e " + minutos + " minutos");
  }  
}
