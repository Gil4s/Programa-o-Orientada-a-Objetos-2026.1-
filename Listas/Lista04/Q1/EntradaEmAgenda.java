public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    // Construtor que recebe todos os dados de uma entrada na agenda
    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    // Retorna true se o dia, mes e ano desta entrada forem iguais aos argumentos
    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }

    // Retorna uma representacao textual da entrada
    public String toString() {
        return hora + "h - " + dia + "/" + mes + "/" + ano + " - " + assunto;
    }
}
