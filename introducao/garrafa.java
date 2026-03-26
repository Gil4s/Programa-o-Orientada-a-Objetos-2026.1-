package introducao; 

public class garrafa { // criaçõ da minha classe 

    String modelo; //entregando atributos a minha classe
    String cor;  //mais um atributo
    float tamanho; // mais um atributo 
    int carga; // mais um atributo 
    boolean encher; // mais um atributo 
    void status () { //Seguinte, aqui, eu estou criando um método --> Lembra muito uma função em C
        System.out.println ("Uma garrafa " + this.cor);
        System.out.println ("modelo " + this.modelo);
        System.out.println ("tamanho " + this.tamanho);
        System.out.println ("carga " + this.carga);
        System.out.println ("encher " + this.encher);
    }
    void encher () { // aqui, eu estou dando início a um novo método da minha classe
        this.encher = true;
        
        System.out.println (" A garrafa está cheia agora");
    }
    
    void secar () { // aqui, eu estou dando início a um novo método da minha classe 
        this.encher = false; 

        System.out.println(" A garrafa está seca");
    }
    
} 