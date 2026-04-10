/*11. Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e informa se o
 segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro. */

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a coordenada x do primeiro ponto: ");
        int x1 = input.nextInt();

        System.out.print("Digite a coordenada y do primeiro ponto: ");
        int y1 = input.nextInt();

        System.out.print("Digite a coordenada x do segundo ponto: ");
        int x2 = input.nextInt();

        System.out.print("Digite a coordenada y do segundo ponto: ");
        int y2 = input.nextInt();

        String posicao = "";

        if (x2 > x1) {
            posicao += "a direita ";
        } else if (x2 < x1) {
            posicao += "a esquerda ";
        }

        if (y2 > y1) {
            posicao += "acima ";
        } else if (y2 < y1) {
            posicao += "abaixo ";
        }

        if (posicao.equals("")) {
            System.out.println("Os pontos sao iguais");
        } else {
            System.out.println("O segundo ponto esta " + posicao + "do primeiro ponto");
        }
    }
}