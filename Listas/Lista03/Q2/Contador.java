/*2.Escreva a classe Contador que encapsule um valor usado para contagem de eventos. 
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo 
com que o acesso ao valor seja feito através de métodos que devem zerar, incremen- 
tar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as 
capacidades da classe criada. */

public class Contador {
    private  int contEventos;

public Contador(){
    this.contEventos = 0;
}

public void incrementa(){
    this.contEventos++;
}

public void zera(){
    this.contEventos = 0;
}

public void imprime(){
    System.out.println("Quantidade de Eventos: " + this.contEventos);
}
    
}
