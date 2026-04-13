package aula07_functions;
import java.util.Scanner;

public class functions {

    public static void main (String []args) { 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os três números para verificarmos o maior: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = max(a,b,c);

        result(maior);

        scanner.close();
    }
    // perceba que eu estou criando uma função para trabalhar com os valores de A, B e C
    // Nessa função, estou configurando m eu ambiente para eu chamar ela na minha MAIN
    // A ideia é, configurar esse function, com os parâmetros
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if ( y > z) {
            aux = y;
        } else {
            aux = z;
        } // fim das condicionais
        

    // PASSO MAIS IMPORTANTE DA FUNÇÃO
    // eu estou armazenando o valor maior em aux, então preciso apresentar o aux para o console ...
    return aux;
    }

    // agora vamos criar uma função para configurar o resultado 
    // eu não quero resotornar nada nessa função, logo, não reciso tipar essa function 
    // mas por que esse inteiro? 

    // perceba que a minha função vai recever um parâmetro, certo?
    //mas veja, por qual motivo eu vou querer passar um inteiro, se a minha função não está sendo tipada?
    // a ideia é o seguinte, como eu não vou retornar nenhum valor, apenas configurar um valor já existente no meu programa, não preciso tipar a função
    // mas por qua motivo eu estou tipando o parâmetro se ele ja existe?
    // Justamente, pq eu preciso configurar que a minha função vai apresentar "alguma coisa em inteiro", e essa alguma coisa, vai estar dentro do programa

    public static void result(int value){
        // Oq aconteceu aqui?
        // Estou imprimindo a "alguma coisa" explicada la em cima, que pode ser absolutamente qualquer variável inteira que eu quiser digitar
        // Mas como quero imprimir o maior valor, lá no meu código main, eu vou configurar a função, para a minha função receber o maior valor, logo, eu mudo o parâmetro
        System.out.println("O maior número é: " + value);
    }
}
