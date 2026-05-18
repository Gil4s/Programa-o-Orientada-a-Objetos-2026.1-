// Interface: funciona como um contrato.
// Qualquer classe que a implemente e obrigada a fornecer todos esses metodos.
public interface ItemDeBiblioteca {

    // Constante da interface: implicitamente public static final
    int maximoDeDiasParaEmprestimo = 14;

    boolean estaEmprestado();

    void empresta();

    void devolve();

    String localizacao();

    String descricao();
}