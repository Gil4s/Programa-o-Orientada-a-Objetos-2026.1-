package SO;

import java.util.ArrayList;
import java.util.List;

public class Escalonador {
    private List<Processo> listaProcessos;
    private int tempoAtual;

    public Escalonador() {
        this.listaProcessos = new ArrayList<>();
        this.tempoAtual = 0; // O relógio da CPU começa no zero
    }

    public void adicionarProcesso(Processo p) {
        listaProcessos.add(p);
    }

    public void executarSJF() {
        int processosConcluidos = 0;
        int n = listaProcessos.size();
        
        System.out.println("\n--- Log de Execução da CPU ---");

        while (processosConcluidos < n) {
            Processo processoEscolhido = buscarMenorProcessoDisponivel();

            if (processoEscolhido != null) {
                System.out.println("Tempo " + tempoAtual + ": Executando Processo " + processoEscolhido.getId() + 
                                   " (Burst: " + processoEscolhido.getTempoExecucao() + ")");
                
                // Avança o tempo de acordo com o tamanho do processo e finaliza
                tempoAtual += processoEscolhido.getTempoExecucao();
                processoEscolhido.finalizar(tempoAtual);
                processosConcluidos++;
            } else {
                // Se nenhum processo chegou ainda, a CPU só vê o tempo passar
                System.out.println("Tempo " + tempoAtual + ": CPU Ociosa...");
                tempoAtual++;
            }
        }
    }

    // Método privado auxiliar para achar o menor processo na fila
    private Processo buscarMenorProcessoDisponivel() {
        Processo escolhido = null;
        int menorBurst = Integer.MAX_VALUE;

        for (Processo p : listaProcessos) {
            if (!p.isConcluido() && p.getTempoChegada() <= tempoAtual) {
                if (p.getTempoExecucao() < menorBurst) {
                    menorBurst = p.getTempoExecucao();
                    escolhido = p;
                } 
                // Regra de desempate: quem chegou primeiro leva a CPU
                else if (p.getTempoExecucao() == menorBurst) {
                    if (p.getTempoChegada() < escolhido.getTempoChegada()) {
                        escolhido = p;
                    }
                }
            }
        }
        return escolhido;
    }

    public void exibirRelatorio() {
        double somaEspera = 0;
        double somaTurnaround = 0;

        System.out.println("\n--- Resumo Final ---");
        System.out.println("ID \t| Chegada \t| Burst \t| Conclusão \t| Espera \t| Turnaround");
        
        for (Processo p : listaProcessos) {
            System.out.println("P" + p.getId() + " \t| " + 
                               p.getTempoChegada() + " \t\t| " + 
                               p.getTempoExecucao() + " \t\t| " + 
                               p.getTempoConclusao() + " \t\t| " + 
                               p.getTempoEspera() + " \t\t| " + 
                               p.getTempoTurnaround());
            
            somaEspera += p.getTempoEspera();
            somaTurnaround += p.getTempoTurnaround();
        }

        int total = listaProcessos.size();
        System.out.println("\nTempo Médio de Espera: " + String.format("%.2f", (somaEspera / total)));
        System.out.println("Tempo Médio de Turnaround: " + String.format("%.2f", (somaTurnaround / total)));
    }
}