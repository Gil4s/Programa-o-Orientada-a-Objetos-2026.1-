public class Matriz {

    // Array 2x2 encapsulado - ninguem acessa diretamente de fora
    private float[][] valores;

    // Construtor que recebe os 4 valores e monta a matriz
    // | a  b |
    // | c  d |
    public Matriz(float a, float b, float c, float d) {
        this.valores = new float[2][2];
        this.valores[0][0] = a;
        this.valores[0][1] = b;
        this.valores[1][0] = c;
        this.valores[1][1] = d;
    }

    // Calcula o determinante: a*d - b*c
    public float determinante() {
        return valores[0][0] * valores[1][1] - valores[0][1] * valores[1][0];
    }

    // Imprime a matriz no formato matricial
    public void imprime() {
        for (int i = 0; i < 2; i++) {
            System.out.print("| ");
            for (int j = 0; j < 2; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}