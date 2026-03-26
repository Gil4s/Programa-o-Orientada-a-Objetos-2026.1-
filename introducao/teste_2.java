package introducao;

public class teste_2 {

public static void main (String [] args) {
    garrafa falsa = new garrafa(); // Aqui, eu estou criando um objeto do tipo garrafa, e dando o nome de falsa para ele.

    falsa.status(); // Puxando o método (Esse tipo de coisa, lembra muito uma função em C)
    
    falsa.encher(); // puxando o método encher, para encher a minha garrafa falsa

    falsa.secar(); // puxando o método secar, para secar a minha garrafa falsa
}

}