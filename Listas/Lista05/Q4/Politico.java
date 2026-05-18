// Politico e um tipo de Pessoa, com partido adicional
public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, int idade, String partido) {
        super(nome, idade); // inicializa os atributos de Pessoa
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        // super.toString() traz Nome e Idade de Pessoa
        return super.toString() + ", Partido: " + partido;
    }
}