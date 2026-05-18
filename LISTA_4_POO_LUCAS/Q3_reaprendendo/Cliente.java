

public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private int telefone;


    public Cliente (int id, String nome, int idade, int telefone){

        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;

    }


    public void impress() {
        System.out.println("id:  " + id + " - nome: " + nome + " - idade: " + idade + " - Tefelone: " + telefone);
    }



}