package LISTA_1_POO_LUCAS;

import java.util.Scanner;

public class questao_19 {
    public static void main(String []args) {

        System.out.print("Qual fatorial você quer calcular ?\nFatorial de: ");
        Scanner scanner = new Scanner(System.in);
        
        int entrada = scanner.nextInt(); 
        int resultado_fatorial;

        resultado_fatorial = fatorial(entrada); 
        result(entrada,resultado_fatorial);

        scanner.close();

    }
    // vamos nos fechar a fatoriais somente positivos
    public static int fatorial(int x){ 
        int n = 1;
        int aux = 1;
        if (x > 0) {
            while (n <= x){
                aux = aux*n;
                n++;
            }
        } else if (x == 0) {
            aux = 1;
        } else {
            aux = 0; 
        }

        return aux;
        }

    public static void result(int numero, int velue) {

        System.out.printf("O resultado do fatorial de %d é: %d", numero,velue);
    }
}
