/*
 * Questao 4:
 * Crie a classe Desenho com dois atributos do tipo FiguraGeometrica e suas
 * coordenadas em um plano bidimensional. Escreva um construtor que inicialize
 * todos os atributos via parametros. Implemente o metodo apresenta() que, para
 * cada FiguraGeometrica, informa suas coordenadas e imprime sua descricao.
 * Crie a classe Principal que cria dois objetos Desenho e chama apresenta():
 * o primeiro formado por Circulo e Quadrado, o segundo por Quadrado e Triangulo.
 */
public class Principal {

    public static void main(String[] args) {

        // Desenho 1: Circulo + Quadrado
        Desenho d1 = new Desenho(new Circulo(),  2, 3,
                                 new Quadrado(), 5, 7);

        // Desenho 2: Quadrado + Triangulo
        Desenho d2 = new Desenho(new Quadrado(),  1, 1,
                                 new Triangulo(), 4, 6);

        System.out.println("=== Desenho 1 ===");
        d1.apresenta();

        System.out.println();

        System.out.println("=== Desenho 2 ===");
        d2.apresenta();
    }
}