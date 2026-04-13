package LISTA_1_POO_LUCAS;

public class questao_15 {
    public static void main (String [] args){

        int i;
        int n = 1; // Contador de quantos números perfeitos achamos
        int meu_numero = 1; // O número que está sendo testado na rodada
        
        do {
            // 1. Zera os divisores no início de cada teste
            int divisores = 0; 
            
            // 2. O laço 'for' vai de 1 até um número antes do 'meu_numero'
            for (i = 1; i < meu_numero; i++) {
                // Se o resto for 0, é divisor! Somamos.
                if (meu_numero % i == 0) {
                    divisores = divisores + i;
                }
            }
            
            // 3
            if (divisores == meu_numero) {
                // 4. Imprime só se for perfeito
                System.out.println(meu_numero); 
                // Aumenta o contador de perfeitos achados!
                n++; 
            }
            
            // 5. Passa para o próximo número a ser testado
            meu_numero++; 
            
        // 6. Condição corrigida: repete enquanto não achar 4 números
        } while (n <= 4); 

    }
}