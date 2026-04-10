/*15. Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito 
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos: 
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14. */

public class Q15 {

    public static void main(String[] args) {

        // Variavel que conta quantos numeros perfeitos ja foram encontrados
        int encontrados = 0;

        // Numero atual que sera testado
        int num = 1;

        // Loop que continua ate encontrar 4 numeros perfeitos
        while (encontrados < 4) {

            // Variavel para armazenar a soma dos divisores de 'num'
            int soma = 0;

            // Percorre todos os numeros de 1 ate num - 1
            for (int i = 1; i < num; i++) {

                // Verifica se 'i' eh divisor de 'num'
                // (ou seja, se o resto da divisao eh 0)
                if (num % i == 0) {

                    // Se for divisor, soma na variavel 'soma'
                    soma += i;
                }
            }

            // Verifica se a soma dos divisores eh igual ao numero
            // Se for, o numero eh perfeito
            if (soma == num) {

                // Imprime o numero perfeito encontrado
                System.out.println(num);

                // Incrementa a quantidade de numeros perfeitos encontrados
                encontrados++;
            }

            // Passa para o proximo numero para continuar o teste
            num++;
        }
    }
}
