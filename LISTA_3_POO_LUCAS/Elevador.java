package LISTA_3;

public class Elevador {
    
    private int andar_atual;
    private int total_andares;
    private int capacidade;
    private int pessoas;
    
    Elevador(){
        this.andar_atual = 0;
        this.total_andares = 0;
        this.capacidade = 0;
        this.pessoas = 0;
    }

    void construtor (int capacidade, int total_andares) { 
        this.capacidade = capacidade;
        this.total_andares = total_andares;
    }

    void entra (){
        if (this.capacidade > this.pessoas ) {
        this.pessoas++;
        }
    }

    void sai (){
        if (this.pessoas > 0) {
            this.pessoas--;
        }
    }

    void sobe(){
        if (this.andar_atual < this.total_andares){
            this.andar_atual++; 
        } else {
        System.out.println("Já estamos no ultimo andar" );            
        }
    }

    void desce(){
        if (this.andar_atual > 0) {
            this.andar_atual--;
        } else {
            System.out.println("Estamos no térreo");
        }
    }
    
    void result(){

        System.out.println("capacidade: " + this.capacidade);
        System.out.println("ANDAR ATUAL: " + this.andar_atual);
        System.out.println("TOTAL DE ANDARES: " + this.total_andares);
        System.out.println("TOTAL DE PESSOAS: " + this.pessoas); 
   }
    
    
}