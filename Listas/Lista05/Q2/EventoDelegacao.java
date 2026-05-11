// Delegacao: DataHora e um CAMPO dentro da classe, nao uma heranca
// a classe "tem um" DataHora, em vez de "ser um" DataHora
public class EventoDelegacao {
    private String evento;

    // instancia de DataHora guardada como atributo (isso e a delegacao)
    private DataHora dataHora;

    public EventoDelegacao(String evento, int dia, int mes, int ano, int hora, int minuto) {
        this.evento = evento;
        // criamos o objeto DataHora internamente e delegamos a ele as informacoes de
        // data/hora
        this.dataHora = new DataHora(dia, mes, ano, hora, minuto);
    }

    public String getEvento() {
        return evento;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public String toString() {
        // delegamos a representacao de data/hora ao toString() do objeto DataHora
        return "Evento: " + evento + " | Data/Hora: " + dataHora.toString();
    }
}