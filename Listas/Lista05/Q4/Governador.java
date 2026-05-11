// Governador e um tipo de Politico, com estado adicional
public class Governador extends Politico {
    private String estado;

    public Governador(String nome, int idade, String partido, String estado) {
        super(nome, idade, partido); // inicializa os atributos de Politico (e de Pessoa)
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        // super.toString() traz Nome, Idade e Partido de Politico
        return super.toString() + ", Estado: " + estado;
    }
}