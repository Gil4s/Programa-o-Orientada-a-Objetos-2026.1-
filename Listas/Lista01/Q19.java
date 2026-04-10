/*Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recur- 
siva, exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação). 
Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu 
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento 
da recursão. */

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = input.nextInt();

        fatorial(n, 0, n);

        input.close();
    }

    public static int fatorial(int num, int nivel, int max) {

        // caso base
        if (num == 0) {
            imprimirEspacos(max - nivel);
            System.out.println("0! = 1");
            return 1;
        }

        // chamada recursiva primeiro
        int resultado = num * fatorial(num - 1, nivel + 1, max);

        // imprime na volta (agora na ordem correta)
        imprimirEspacos(max - nivel);
        System.out.println(num + "! = " + resultado);

        return resultado;
    }

    // função auxiliar para espaços
    public static void imprimirEspacos(int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.print("    "); // 4 espaços
        }
    }
}