/*
 * Questao 5:
 * Crie a interface ItemDeBiblioteca com o campo maximoDeDiasParaEmprestimo (14)
 * e os metodos: estaEmprestado, empresta, devolve, localizacao e descricao.
 * Implemente a classe Livro com os atributos titulo, autor, numeroDePaginas e
 * anoDaEdicao, alem dos metodos qualTitulo, qualAutor e toString.
 * Crie LivroDeBiblioteca que herda Livro e implementa ItemDeBiblioteca.
 * Crie DemoLivroDeBiblioteca para demonstrar o uso de LivroDeBiblioteca.
 */
public class DemoLivroDeBiblioteca {

    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca(
            "Clean Code", "Robert C. Martin", 431, 2008, "corredor 2, prateleira D"
        );

        System.out.println(livro);
        System.out.println("Descricao: " + livro.descricao());
        System.out.println("Localizacao: " + livro.localizacao());
        System.out.println("Esta emprestado? " + livro.estaEmprestado());

        System.out.println();

        livro.empresta();
        System.out.println("Apos empresta():");
        System.out.println("Esta emprestado? " + livro.estaEmprestado());

        System.out.println();

        livro.devolve();
        System.out.println("Apos devolve():");
        System.out.println("Esta emprestado? " + livro.estaEmprestado());
    }
}