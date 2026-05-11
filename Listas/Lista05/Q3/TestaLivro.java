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