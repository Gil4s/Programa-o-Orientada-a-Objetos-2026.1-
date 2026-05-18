public class DataHora {
    // vamos usar essa classe para que o EventoDelegacao herde a mesma
    // As outras classes, vão depender dessa.

    private int dia;
    private int ano;
    private int mes;
    private int hora;
    private int minuto;
    

    // Como você vai exigir que esses dados sejam preenchidos quando alguém for criar um objeto "DataHora"?

    public DataHora (int dia, int mes, int ano, int hora, int minuto) { 

        this.hora = hora;
        this.minuto = minuto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;   

    }

    // método que eu criei para trabalhar com as mensagens
    public String toString() {
        return "--> Hora: " + hora + " - Minuto: " + minuto + " - Dia:" + dia +  " - Mês: " + mes + " - Ano: " + ano;  
    }


}