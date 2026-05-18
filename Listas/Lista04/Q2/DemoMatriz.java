/*
  2. Escreva uma classe que encapsule uma matriz de tamanho 2x2 de valores do tipo float
     usando um array de duas dimensoes. Nesta classe, alem do construtor, escreva um metodo
     que calcule o determinante da matriz encapsulada e um metodo que permita a impressao
     em formato matricial dos seus valores. Escreva um aplicativo de teste que demonstre
     as capacidades da classe criada.
 */
public class DemoMatriz {
    public static void main(String[] args) {

        // Matriz 1: determinante positivo
        // | 3  4 |
        // | 2  5 |
        // det = 3*5 - 4*2 = 15 - 8 = 7
        Matriz m1 = new Matriz(3, 4, 2, 5);
        System.out.println("=== Matriz 1 ===");
        m1.imprime();
        System.out.println("Determinante: " + m1.determinante());

        System.out.println();

        // Matriz 2: determinante negativo
        // | 1  3 |
        // | 4  2 |
        // det = 1*2 - 3*4 = 2 - 12 = -10
        Matriz m2 = new Matriz(1, 3, 4, 2);
        System.out.println("=== Matriz 2 ===");
        m2.imprime();
        System.out.println("Determinante: " + m2.determinante());

        System.out.println();

        // Matriz 3: determinante zero (matriz singular)
        // | 2  4 |
        // | 1  2 |
        // det = 2*2 - 4*1 = 4 - 4 = 0
        Matriz m3 = new Matriz(2, 4, 1, 2);
        System.out.println("=== Matriz 3 ===");
        m3.imprime();
        System.out.println("Determinante: " + m3.determinante());
    }
}