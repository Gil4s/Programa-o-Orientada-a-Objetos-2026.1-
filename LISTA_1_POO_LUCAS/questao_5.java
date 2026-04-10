package LISTA_1_POO_LUCAS;

public class questao_5{

    public static void main (String [] args){

        int valor = 123;

        int valor_dezena = (valor%100)/10;
        int valor_centena = (valor/100);
        int valor_unidade = (valor%10);

        System.out.printf("valor final em UCD: " + valor_unidade + valor_centena + valor_dezena);
    }
}