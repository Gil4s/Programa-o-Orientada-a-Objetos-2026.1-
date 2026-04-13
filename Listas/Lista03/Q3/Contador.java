
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
    System.out.println("Quantidade de vezes que a lamapada foi acesa: " + this.contEventos);
}
    
}
