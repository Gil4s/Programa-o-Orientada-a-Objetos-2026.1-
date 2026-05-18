public class EventoHeranca extends DataHora {

    private String evento;


    public EventoHeranca (String evento, int ano, int mes, int dia, int hora, int minuto) {
        
        super(dia, mes, ano, hora, minuto);
        
        this.evento = evento;
    }

    @Override // sobrescrever 
    public String toString () {

        return super.toString() + " - Evento : " + evento;

    }


}