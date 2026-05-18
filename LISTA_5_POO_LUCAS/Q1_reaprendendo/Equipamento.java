public class Equipamento{


    private String marca;
    private int fabricacao;


    public Equipamento (int fabricacao, String marca){

        this.marca = marca;
        this.fabricacao = fabricacao;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getFabricacao() {
        return fabricacao;
    }


    public void setFabricacao(int fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String toString(){
        return "Fabricacao: " + fabricacao + " - Marca: " + marca;
    }

}

