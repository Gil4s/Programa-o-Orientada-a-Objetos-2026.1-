// LivroLivraria e um tipo de Livro — focado em venda
public class LivroLivraria extends Livro {
    private double preco;
    private int quantidadeEstoque;

    public LivroLivraria(String titulo, String autor, double preco, int quantidadeEstoque) {
        super(titulo, autor);
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return super.toString() + ", Preco: R$" + preco + ", Estoque: " + quantidadeEstoque + " unidades";
    }
}