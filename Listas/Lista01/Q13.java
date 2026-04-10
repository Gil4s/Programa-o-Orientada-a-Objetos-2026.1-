/*1. Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena 
(somente com os números, respeitando o número de linhas e a distribuição dos números 
nas linhas).  */
public class Q13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 60; i++) {

            // imprime com 2 dígitos
            if (i < 10) {
                System.out.print("0" + i + " ");
            } else {
                System.out.print(i + " ");
            }

            // quebra linha a cada 10 números
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
