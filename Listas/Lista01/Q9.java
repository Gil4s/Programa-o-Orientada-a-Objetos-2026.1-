/*9.Escreva um programa que lê um número que representa o valor da carta, de um (ás) a 
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 = 
espadas). O programa deve imprimir o nome da carta por extenso. */
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Digite o valor da carta. ");
        int carta = input.nextInt();
        System.err.print("Digite o valor do naipe. ");
        int naipe = input.nextInt();

        String nomeCarta = "";
        String nomeNaipe = "";

        switch (carta) {
    case 1:
    nomeCarta = "As";
    break;
    case 11:
    nomeCarta = "Valete";
    break;
    case 12:
    nomeCarta = "Rainha";
    break;
    case 13:
    nomeCarta = "Rei";
    break;
    default:
    System.err.println("Valor da carta Invalido.");
    return;
        }

        switch (naipe) {
    case 1:
    nomeNaipe = "Ouros";
    break;
    case 2:
    nomeNaipe = "Paus";
    break;
    case 3:
    nomeNaipe = "Copas";
    break;
    case 4:
    nomeNaipe = "Espadas";
    break;
    default:
    System.err.println("Valor do naipe Invalido."); 
    return;
        }

        System.err.print(nomeCarta + " de " + nomeNaipe);
    }
}
