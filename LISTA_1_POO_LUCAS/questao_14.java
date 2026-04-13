package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Pedimos ao usuário quantos números ele quer ver
        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int n = scanner.nextInt();

        // 2. Criamos as "caixinhas" (variáveis) para lembrar dos valores.
        // O primeiro número da sequência é 0 e o segundo é 1.
        int anterior = 0; 
        int atual = 1;    
        int fibonacci;    // Caixinha para guardar a soma

        System.out.println("Sequência de Fibonacci:");

        // 3. O laço 'for' funciona apenas como um relógio. 
        // Ele vai bater 'n' vezes, começando do passo 1 e indo até o passo 'n'.
        for (int i = 1; i <= n; i++) {

            // Tratamento especial para o PRIMEIRO termo
            if (i == 1) {
                System.out.print(anterior + " ");
            } 
            // Tratamento especial para o SEGUNDO termo
            else if (i == 2) {
                System.out.print(atual + " ");
            } 
            // Do TERCEIRO termo em diante, aplicamos a sua regra!
            else {
                // A regra: O novo número é a soma dos dois anteriores
                fibonacci = anterior + atual;
                
                // Imprimimos o número calculado na tela
                System.out.print(fibonacci + " ");
                
                // --- A PARTE MAIS IMPORTANTE: PREPARAR O PRÓXIMO GIRO ---
                // Para que a conta funcione no próximo passo do laço,
                // a fila precisa andar. O que era 'atual' vira o 'anterior',
                // e o que acabamos de calcular (fibonacci) vira o 'atual'.
                anterior = atual;
                atual = fibonacci;
            }
        }
        
        // Fechamos o scanner para liberar recursos da memória (boa prática!)
        scanner.close(); 
    }   
}