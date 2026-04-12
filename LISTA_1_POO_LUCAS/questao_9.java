package LISTA_1_POO_LUCAS; 
import java.util.Scanner;


public class questao_9{

    public static void main (String []args) {
        String numero, naipe_string;

        Scanner scanner = new Scanner (System.in);


        System.out.println("Qual a numeração da sua carta? ");
        int valor = scanner.nextInt();


        if (valor > 13 || valor < 1) {
            System.out.println("Valor inválido, tente novamente");
        } else {
            switch (valor) {
            case 1: numero = "Ás (1)";
            break;
            case 2: numero = "Dois (2)";
            break;
            case 3: numero = "Três (3)";
            break;
            case 4: numero = "Quatro (4)";
            break;
            case 5: numero = "Cinco (5)";
            break;
            case 6: numero = "Seis (6)";
            break;
            case 7: numero = "Sete (7)";
            break;
            case 8: numero = "Oito (8)";
            break;
            case 9: numero = "Nove (9)";
            break;
            case 10: numero = "Dez (10)";
            break;
            case 11: numero = "Valete (11)";
            break;
            case 12: numero = "Damas (12)";
            break;
            case 13: numero = "Reis (13)";
            break;
            default: numero = "Desconhecido";
            }
                
            System.out.println("Qual o nipe da sua carta? \nDigite 1 para Ouros (Losângulo)\nDigite 2 para Paus (arverezinha)\nDigite 3 para Copas (coração)\nDigite 4 para Espadas (Coração com base)");
            int naipe = scanner.nextInt();
            if (naipe > 4 || naipe < 1){  
                System.out.println("Naipe Inválido. Tente novamente!");
            } else {
                    switch (naipe) {
                        case 1: naipe_string = "Ouros";
                        break;
                        case 2: naipe_string = "Paus";
                        break;
                        case 3: naipe_string = "Copas";
                        break;
                        case 4: naipe_string = "Espadas";
                        break;
                        default: naipe_string = "Desconhecido";
                        
                    }
                System.out.printf("========================%n Sua carta é o %s de naipe %s %n======================== ", numero, naipe_string);
            }
            
        }
    }
}