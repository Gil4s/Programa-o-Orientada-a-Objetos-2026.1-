/*
 * Questao 3
 * Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro.
 * Quais as diferencas entre as duas classes e que campos elas tem em comum?
 * Defina os atributos de cada classe e escreva um aplicativo de teste que
 * demonstre o uso das classes criadas.
 */

public class TestaLivro {
    public static void main(String[] args) {

        LivroLivraria ll = new LivroLivraria("Clean Code", "Robert Martin", 89.90, 15);
        System.out.println("=== Livro Livraria ===");
        System.out.println(ll);

        LivroBiblioteca lb = new LivroBiblioteca("Dom Casmurro", "Machado de Assis", "BIB-2041", true);
        System.out.println("\n=== Livro Biblioteca ===");
        System.out.println(lb);
    }
}