package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_20 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número para o MDC: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número para o MDC: ");
        int b = scanner.nextInt();

        // Chama a função recursiva e guarda o resultado
        int resultado = mdc(a, b);
        
        // Chama a sua função personalizada para imprimir a tela
        result(resultado);

        scanner.close();
    }

    // FUNÇÃO RECURSIVA DO MDC
    // Note que usei as letras 'n' e 'm' exatamente como no seu enunciado
    public static int mdc(int n, int m) {
        
        // REGRA 1: "se o segundo for maior que o primeiro, inverta"
        // O algoritmo funciona dividindo o maior pelo menor. Se vier invertido,
        // nós apenas chamamos a função de novo trocando a ordem.
        if (m > n) {
            return mdc(m, n); 
        } 
        
        // REGRA 2: O Ponto de Parada (Caso Base)
        // Se o segundo número chegou a zero, acabou! O MDC é o número que sobrou (n).
        else if (m == 0) {
            return n;
        } 
        
        // REGRA 3: O Passo Recursivo
        // "senão, retorne mdc(m, n % m)"
        // Aqui a mágica acontece. Chamamos a função de novo, mas encolhemos 
        // os números usando o resto da divisão.
        else {
            return mdc(m, n % m);
        }
    }

    // A sua função de impressão continuou intacta e perfeita!
    public static void result(int value) {
        System.out.println("O valor do MDC é: " + value);
    }
}