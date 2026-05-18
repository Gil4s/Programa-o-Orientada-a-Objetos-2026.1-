// Prefeito e um tipo de Politico, com cidade adicional
public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade) {
        super(nome, idade, partido); // inicializa os atributos de Politico (e de Pessoa)
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        // super.toString() traz Nome, Idade e Partido de Politico
        return super.toString() + ", Cidade: " + cidade;
    }
}