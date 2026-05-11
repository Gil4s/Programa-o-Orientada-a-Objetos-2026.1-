/*
  1. Escreva um aplicativo que calcula o produto de uma serie de inteiros que sao passados
     para um metodo produto utilizando uma lista de argumentos de comprimento variavel.
     Escreva tambem uma classe executavel que teste seu metodo com varias chamadas,
     cada uma com um numero diferente de argumentos.
 */
public class DemoCalculadora {
    public static void main(String[] args) {

        // Testando com diferentes quantidades de argumentos
        System.out.println("Produto de 2 e 3: " + Calculadora.produto(2, 3));
        System.out.println("Produto de 2, 3 e 4: " + Calculadora.produto(2, 3, 4));
        System.out.println("Produto de 2, 3, 4 e 5: " + Calculadora.produto(2, 3, 4, 5));
        System.out.println("Produto de 2, 3, 4, 5 e 6: " + Calculadora.produto(2, 3, 4, 5, 6));

        // Caso especial: nenhum argumento (resultado deve ser 1)
        System.out.println("Produto sem argumentos: " + Calculadora.produto());

        // Caso especial: um unico argumento
        System.out.println("Produto de 7: " + Calculadora.produto(7));
    }
}