/*  1. Escreva um programa que calcule a área de um quadrado. O valor do lado de um qua- 
drado deverá ser informado pelo usuário.*/
// Importa a classe Scanner, que permite ler dados digitados pelo usuario
import java.util.Scanner;

// Declaracao da classe chamada Q1 (nome deve ser igual ao arquivo Q1.java)
public class Q1 {

   // Metodo principal, onde a execucao do programa comeca
   public static void main(String[] args) {

      // Cria um objeto Scanner chamado 'input' para ler dados do teclado
      Scanner input = new Scanner(System.in);

      // Exibe uma mensagem na tela pedindo um valor ao usuario
      System.out.println("Digite o valor do lado do quadrado.");

      // Lê um numero decimal digitado pelo usuario e armazena na variavel 'lado'
      double lado = input.nextDouble();

      // Calcula a area do quadrado (lado * lado) e armazena na variavel 'area'
      double area = lado * lado;

      // Exibe o resultado da area na tela
      System.out.println("Area: " + area);
    
   } 
}