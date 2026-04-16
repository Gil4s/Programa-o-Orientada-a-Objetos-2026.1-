package LISTA_3;

public class DemoElevador {

    public static void main(String[]args){ 

        // estou chamando a minha classe para eu poder trabalhar com os atributos
        Elevador objeto_teste = new Elevador();

        objeto_teste.construtor(20, 10);

        objeto_teste.entra(); // aqui, eu já estou adicionando uma pessoa no meu elevador
        objeto_teste.result(); // estou mostrando os dados do meu objeto
        
        objeto_teste.sai(); // aqui, eu estou removendo uma pessoa do meu elevador
        objeto_teste.result(); // estou mostrando os dados do meu objeto

        objeto_teste.sobe(); // aqui, eu estou configurando o método "sobe"
        objeto_teste.result(); // estou mostrando os dados do meu objeto

        objeto_teste.desce(); // aqui, eu estou configurando o meu método "desce"       
        objeto_teste.result(); // estou mostrando os dados do meu objeto

        objeto_teste.result(); // estou mostrando os dados do meu objeto
        objeto_teste.result(); // estou mostrando os dados do meu objeto

    }

    
}
