package aula08_atributos;


import java.util.Locale;
import java.util.Scanner;

import aula08_atributos.entities.triangulo;

public class programa_com_classe { 

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        
        // forma antiga que estávamos usando para o triangulo sem importação de classes no programa
        // double xA, xB, xC, yA, yB, yC;

        x = new triangulo();
        y = new triangulo();


        System.out.println("Entre com os dados do triângulo X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Entre com os dados do triângulo Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triangulo X com a maior área: " + areaX);
        } else if (areaY > areaX) {
            System.out.println("Triangulo Y com a maior área: " + areaY);
        } else {
            System.out.println("As áreas são iguais!");
        }

        scanner.close();
    }
}