public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String telefone;

    // Construtor que recebe todos os dados do cliente
    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    // Imprime os dados do cliente
    public void imprime() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
        System.out.println();
    }
}
