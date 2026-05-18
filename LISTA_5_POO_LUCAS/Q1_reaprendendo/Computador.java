

public class Computador extends Equipamento{ // extends para acessar a minha classe diretamente (estou herdando equipamento)

    private int memoria;
    private String cpu;



    public Computador (int fabricacao, String marca, int memoria, String cpu){
        // Sepre que eu for herdar uma atributo de outra classe, o super sempre tem que vim na primeira linha

        super(fabricacao, marca); // 


        this.memoria = memoria;
        this.cpu = cpu;
    }


    public int getMemoria() {
        return memoria;
    }


    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }


    public String getCpu() {
        return cpu;
    }


    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    // cuidado a mais com o override (pesquisar depois)
    @Override // por padrão, o toString sempre fica no final. 

    public String toString () {
        
        // Aqui eu vou concatenar duas toString ... 

        // A String da minha classe mais a outra classe.
        return super.toString() + " - Memo: " + memoria + " - Processador: " + cpu;

    } 
}