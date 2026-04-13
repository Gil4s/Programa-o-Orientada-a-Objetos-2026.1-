

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador();
        elevador1.construtor(10, 20);

        elevador1.imprime();

        elevador1.entra();
        elevador1.entra();
        elevador1.imprime();

        elevador1.sai();
        elevador1.imprime();

        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.imprime();

        elevador1.desce();
        elevador1.imprime();

        elevador1.desce();
        elevador1.desce();
        elevador1.desce();

        elevador1.sai();
        
        elevador1.imprime();
    }
}
