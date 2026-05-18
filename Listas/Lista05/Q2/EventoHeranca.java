// Heranca: EventoHeranca "e um" DataHora, herdando seus atributos e metodos
public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(String evento, int dia, int mes, int ano, int hora, int minuto) {
        // super() chama o construtor de DataHora para inicializar os atributos herdados
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        // super.toString() reaproveita a representacao de DataHora
        return "Evento: " + evento + " | Data/Hora: " + super.toString();
    }
}