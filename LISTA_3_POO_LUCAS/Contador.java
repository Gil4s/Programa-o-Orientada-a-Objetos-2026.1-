package LISTA_3;

public class Contador {

    private int valor;

    Contador (){ 
        this.valor = 0;
    }

    void incrementar (){
        this.valor++;

    }

    void zerar (){
        this.valor = 0;
    }
    

    void imprimir (){
    
        System.out.println("O valor do contador é: " + valor);
    }
    
}
