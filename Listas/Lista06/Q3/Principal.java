/*
 * Questao 3:
 * Crie a classe FiguraGeometrica que possui um metodo abstrato descricao().
 * Crie tambem as classes Circulo, Quadrado e Triangulo que sao subclasses
 * de FiguraGeometrica e implementam o metodo descricao() apropriado.
 * Por fim, crie uma classe Principal com um metodo main que cria um objeto
 * de cada classe e chama seus respectivos metodos descricao().
 */
public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica circulo   = new Circulo();
        FiguraGeometrica quadrado  = new Quadrado();
        FiguraGeometrica triangulo = new Triangulo();

        circulo.descricao();
        quadrado.descricao();
        triangulo.descricao();
    }
}
