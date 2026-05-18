public class EntradaEmAgenda{

    private int hora;
    private int dia;
    private int ano;
    private int mes;
    private String assunto;


    public EntradaEmAgenda (int hora, int dia, int mes, int ano, String assunto) {

        this.hora = hora;
        this.dia = dia;
        this.ano = ano;
        this.mes = mes; 
        this.assunto = assunto;

    }

    public String toString() {
        return hora + "h - " + dia + "/" + mes + "/" + ano + " - " + assunto;
    }

    public boolean ehNoDia (int dia, int mes, int ano){ // Configuração de parâmetro
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }

}