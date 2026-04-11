package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_7{

    public static void main (String [] args) {

        double number_1;
        double number_2;
        double number_3;
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do primeiro número:"); 
    number_1 = scanner.nextDouble();

    System.out.println("Digite o valor do segundo número:");
    number_2 = scanner.nextDouble();

    System.out.println("Digite o valor do terceiro número:");
    number_3 = scanner.nextDouble();

    double maior, meio, menor;
    if (number_1 > number_2 && number_1 > number_3) {
        maior = number_1;
    } else if (number_2 > number_1 && number_2 > number_3){ 
        maior = number_2;       
    } else{
        maior = number_3;
    }

    if (maior > number_1 && (number_1 > number_2 || number_1 > number_3)) {
        meio = number_1;
    } else if (maior > number_2 && (number_2 > number_1 || number_2 > number_3)){
        meio = number_2;
    } else {
        meio = number_3;
    } 
    
    if (number_1 < meio){
        menor = number_1;
    } else if (number_2 < meio) {
        menor = number_2;
    } else {
        menor = number_3;
    }
    scanner.close();
    
    System.out.printf("O Valor em ordem dos seus números é;%n Maior: %.2f%n Meio: %.2f%n Menor: %.2f%n" , maior, meio, menor);

    }
}
