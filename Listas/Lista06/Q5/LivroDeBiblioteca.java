// Herda Livro e implementa o contrato da interface ItemDeBiblioteca.
// A palavra-chave 'implements' indica que essa classe assina o contrato da interface.
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    private boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas,
                              int anoDaEdicao, String localizacao) {
        // Chama o construtor da superclasse Livro
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
        this.emprestado = false;
    }

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }

    @Override
    public void empresta() {
        emprestado = true;
    }

    @Override
    public void devolve() {
        emprestado = false;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }

    @Override
    public String descricao() {
        return "Livro: " + qualTitulo() + " de " + qualAutor();
    }

    @Override
    public String toString() {
        return super.toString() + " | Localizacao: " + localizacao +
               " | Emprestado: " + emprestado +
               " | Maximo de dias para emprestimo: " + maximoDeDiasParaEmprestimo;
    }
}