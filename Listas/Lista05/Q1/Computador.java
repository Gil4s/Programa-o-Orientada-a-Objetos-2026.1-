// "extends Equipamento" é o que define a herança
// Computador é uma subclasse (filha) e Equipamento é a superclasse (pai)
// Computador herda automaticamente todos os atributos e métodos de Equipamento
public class Computador extends Equipamento {
    private String processador;
    private int memoriaRAM;

    public Computador(String marca, int anoFabricacao, String processador, int memoriaRAM) {
        // super(...) chama o construtor da superclasse (Equipamento)
        // obrigatório quando a superclasse não tem construtor vazio
        // e DEVE ser a primeira linha do construtor
        super(marca, anoFabricacao);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    // @Override indica que estamos sobrescrevendo o toString de Equipamento
    // super.toString() reaproveita o texto já montado em Equipamento
    // sem ele, precisaríamos repetir "Marca: ..." aqui, quebrando o reúso
    @Override
    public String toString() {
        return super.toString() + ", Processador: " + processador + ", RAM: " + memoriaRAM + "GB";
    }
}