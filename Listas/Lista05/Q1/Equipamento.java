public class Equipamento {
    private String marca;
    private int anoFabricacao;

    // Construtor da classe base — inicializa os atributos diretamente
    public Equipamento(String marca, int anoFabricacao) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters e Setters — necessários pois os atributos são private
    // sem eles, nenhuma outra classe (nem as filhas) consegue acessá-los
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Sobrescreve o toString padrão herdado da classe Object
    // Sem isso, imprimir o objeto mostraria algo como "Equipamento@1b6d3586"
    @Override
    public String toString() {
        return "Marca: " + marca + ", Ano de Fabricacao: " + anoFabricacao;
    }
}