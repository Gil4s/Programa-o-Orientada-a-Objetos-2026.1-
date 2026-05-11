// LivroBiblioteca e um tipo de Livro — focado em emprestimo
public class LivroBiblioteca extends Livro {
    private String codigoTombo;
    private boolean disponivel;

    public LivroBiblioteca(String titulo, String autor, String codigoTombo, boolean disponivel) {
        super(titulo, autor);
        this.codigoTombo = codigoTombo;
        this.disponivel = disponivel;
    }

    public String getCodigoTombo() {
        return codigoTombo;
    }

    public void setCodigoTombo(String codigoTombo) {
        this.codigoTombo = codigoTombo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        // operador ternario: se disponivel for true imprime "Sim", senao "Nao"
        return super.toString() + ", Tombo: " + codigoTombo + ", Disponivel: " + (disponivel ? "Sim" : "Nao");
    }
}