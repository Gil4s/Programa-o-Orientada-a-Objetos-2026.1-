// aqui, a questão pede que eu crie uma classe para encapsular a minha matriz

public class MatrizMaior { // matriz[linha][coluna]
    
    // A atribuição do tamanho da minha matriz, vem junto da criação dela, logo, vamos entrar com os tamanhos dentro dos colchetes depois da criação
    private float [][] matriz = new float [2][2]; // tamanho -> length. Vamos trabalhar com essa tipagem para tamanho das matrizes

    public MatrizMaior (float [][] matrizExterna){

        this.matriz = matrizExterna;    

    }

    // para calcular o determinante em uma 2 x 2 -> Temos;
    // revisão de GA
    // primeiro índice 0i0j * 1i1j - (1i0j * 1j1i)

    // precisamos acessar cada ponto dessa matriz, no caso

    public float calcularDeterminante (){ // não é void, é um resultado float somente
       return ((this.matriz [0][0] * this.matriz[1][1]) - (this.matriz[0][1] * this.matriz[1][0]));
    } 


    // configurar a impressão para teste
    public void impressao () {
        for (int i = 0; i < 2; i++){ // percorrendo o i
            System.out.println("");
            for (int j = 0; j < 2; j++) { // aqui é o seguinte, eu vou percorrer as linhas, e vou para cada linha, percorrer uma coluna
                System.out.print(this.matriz[i][j] + " "); // passando os valores e espaçando para que fiquem expressos de forma condizente "".
            }
        }

    }
}
