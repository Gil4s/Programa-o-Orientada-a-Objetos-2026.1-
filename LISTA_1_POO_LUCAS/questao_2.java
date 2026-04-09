package LISTA_1_POO_LUCAS;
import java.util.Scanner;

public class questao_2 {

    public static void main (String []args){

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println( "O valor da média do aluno é: " + media);

        entrada.close();


        
    }
}