package SO;

public class Processo {
    private int id;
    private int tempoChegada;
    private int tempoExecucao; // Burst
    private int tempoConclusao;
    private int tempoTurnaround;
    private int tempoEspera;
    private boolean concluido;

    public Processo(int id, int tempoChegada, int tempoExecucao) {
        this.id = id;
        this.tempoChegada = tempoChegada;
        this.tempoExecucao = tempoExecucao;
        this.concluido = false;
    }

    // Métodos Getters (Encapsulamento)
    public int getId() { return id; }
    public int getTempoChegada() { return tempoChegada; }
    public int getTempoExecucao() { return tempoExecucao; }
    public int getTempoConclusao() { return tempoConclusao; }
    public int getTempoTurnaround() { return tempoTurnaround; }
    public int getTempoEspera() { return tempoEspera; }
    public boolean isConcluido() { return concluido; }

    // O processo calcula suas próprias métricas quando termina de rodar
    public void finalizar(int tempoAtual) {
        this.tempoConclusao = tempoAtual;
        this.tempoTurnaround = this.tempoConclusao - this.tempoChegada;
        this.tempoEspera = this.tempoTurnaround - this.tempoExecucao;
        this.concluido = true;
    }
}