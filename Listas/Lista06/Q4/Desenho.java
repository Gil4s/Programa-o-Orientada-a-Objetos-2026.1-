public class Desenho {

    // Dois atributos do tipo FiguraGeometrica e suas coordenadas (x, y)
    private FiguraGeometrica figura1;
    private int x1, y1;

    private FiguraGeometrica figura2;
    private int x2, y2;

    // Construtor inicializa todos os atributos via parametros
    public Desenho(FiguraGeometrica figura1, int x1, int y1,
            FiguraGeometrica figura2, int x2, int y2) {
        this.figura1 = figura1;
        this.x1 = x1;
        this.y1 = y1;
        this.figura2 = figura2;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Para cada figura, informa as coordenadas e imprime sua descricao
    public void apresenta() {
        System.out.println("Figura 1 na posicao (" + x1 + ", " + y1 + "):");
        figura1.descricao();

        System.out.println("Figura 2 na posicao (" + x2 + ", " + y2 + "):");
        figura2.descricao();
    }
}