package SO;

import java.util.Scanner;

public class SJF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escalonador escalonador = new Escalonador();
        
        System.out.println("--- Simulador Dinâmico SJF (Orientado a Objetos) ---");
        System.out.print("Quantidade de processos: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nProcesso " + (i + 1) + ":");
            System.out.print("Tempo de Chegada: ");
            int chegada = sc.nextInt();
            System.out.print("Tempo de Execução (Burst): ");
            int burst = sc.nextInt();
            
            // Instancia o processo e joga para o escalonador
            Processo novoProcesso = new Processo(i + 1, chegada, burst);
            escalonador.adicionarProcesso(novoProcesso);
        }
        
        // Executa a lógica e mostra os resultados
        escalonador.executarSJF();
        escalonador.exibirRelatorio();
        
        sc.close();
    }
}