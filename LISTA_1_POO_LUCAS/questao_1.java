package LISTA_1_POO_LUCAS;

import java.util.Scanner;


    public class questao_1{

        public static void main (String [] args) {

            double lado_quadrado;
            double area;

            Scanner lado = new Scanner(System.in);
            lado.useLocale(java.util.Locale.US); // Força o uso de ponto para decimais

            System.out.println("Digite o valor dos lados do seu quadrado: ");

            lado_quadrado = lado.nextDouble();

            area = lado_quadrado*lado_quadrado;

            System.out.println("O valor da sua área é" + area);

            lado.close();   

        }
    }
